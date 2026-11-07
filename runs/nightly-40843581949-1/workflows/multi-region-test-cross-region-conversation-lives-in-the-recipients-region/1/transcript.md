# Transcript: A cross-region conversation is stored in the recipient's region, for both sides

| | |
|---|---|
| Test | `com.qaautomation.tests.workflows.MultiRegionTest#crossRegionConversationLivesInTheRecipientsRegion` |
| Features | FEAT-REGION-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 11 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 490 | `qa-cb3a1f50-d3c0-4d04-8af3-294a3416b605` |
| 2 | `POST /v1/accounts` | 201 | 70 | `qa-25b8a7ec-6455-48bc-a81c-d0f85c7e8854` |
| 3 | `POST /v1/auth/token` | 200 | 34 | `qa-92d67d5c-41ae-42db-b497-c1242e4d223d` |
| 4 | `POST /v1/conversations` | 201 | 104 | `qa-944733d1-40c9-4b9a-9e0b-a3e79ef4ac15` |
| 5 | `GET /v1/conversations/{id}` | 200 | 38 | `qa-be47eb35-1774-40f3-9669-03147ab2a685` |
| 6 | `POST /v1/auth/token` | 200 | 20 | `qa-a9c42554-d6e4-4e8e-82c1-400e92af199f` |
| 7 | `GET /v1/conversations/{id}` | 200 | 8 | `qa-1b6ed00c-96dc-4548-9bb9-bb67ee0f332c` |
| 8 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-07ea91d6-2744-408b-ad06-50bb16e59805` |
| 9 | `POST /v1/auth/token` | 401 | 16 | `qa-e6f61cde-351f-49a8-b7df-fbe1834d5595` |
| 10 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-59922950-b402-4377-a288-7d1ce459e138` |
| 11 | `POST /v1/auth/token` | 401 | 17 | `qa-a827b360-87e8-4072-a5dc-735990932554` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-cb3a1f50-d3c0-4d04-8af3-294a3416b605

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb3a1f50-d3c0-4d04-8af3-294a3416b605
Content-Type: application/json

--- request body ---
{"handle":"qa-3d208117a24c","displayName":"QA 3d208117a24c","password":"****","region":"in"}

--- response: 201 in 490 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-cb3a1f50-d3c0-4d04-8af3-294a3416b605
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 11
Location: /v1/accounts/qa-3d208117a24c
X-Served-Region: in
Content-Length: 181

{"id":"acc_417dca98-1d7c-42b1-9794-dcf183da21ef","handle":"qa-3d208117a24c","displayName":"QA 3d208117a24c","region":"in","role":"user","createdAt":"2026-10-29T08:38:57.202165502Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-25b8a7ec-6455-48bc-a81c-d0f85c7e8854

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-25b8a7ec-6455-48bc-a81c-d0f85c7e8854
Content-Type: application/json

--- request body ---
{"handle":"qa-c51eb0aeec85","displayName":"QA c51eb0aeec85","password":"****","region":"eu"}

--- response: 201 in 70 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-25b8a7ec-6455-48bc-a81c-d0f85c7e8854
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 10
Location: /v1/accounts/qa-c51eb0aeec85
X-Served-Region: eu
Content-Length: 181

{"id":"acc_46fb8ebe-964b-49c3-bbb2-d8e457f6e7be","handle":"qa-c51eb0aeec85","displayName":"QA c51eb0aeec85","region":"eu","role":"user","createdAt":"2026-10-29T08:38:57.619036074Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-92d67d5c-41ae-42db-b497-c1242e4d223d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-92d67d5c-41ae-42db-b497-c1242e4d223d
Content-Type: application/json

--- request body ---
{"handle":"qa-3d208117a24c","password":"****"}

--- response: 200 in 34 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-92d67d5c-41ae-42db-b497-c1242e4d223d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_417dca98-1d7c-42b1-9794-dcf183da21ef"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-944733d1-40c9-4b9a-9e0b-a3e79ef4ac15

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-944733d1-40c9-4b9a-9e0b-a3e79ef4ac15
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c51eb0aeec85","subject":"Across regions","message":"Namaste"}

--- response: 201 in 104 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-944733d1-40c9-4b9a-9e0b-a3e79ef4ac15
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: in
Location: /v1/conversations/cnv_17807ea9-1849-41fd-a270-be1e1cf39c85
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_17807ea9-1849-41fd-a270-be1e1cf39c85","subject":"Across regions","status":"open","region":"eu","participants":["qa-3d208117a24c","qa-c51eb0aeec85"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-29T08:38:57.821729467Z"}
```

## 5. GET /v1/conversations/{id}

```text
#5 GET http://localhost:7070/v1/conversations/cnv_17807ea9-1849-41fd-a270-be1e1cf39c85
correlation: qa-be47eb35-1774-40f3-9669-03147ab2a685

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-be47eb35-1774-40f3-9669-03147ab2a685
Content-Type: application/json

--- response: 200 in 38 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-be47eb35-1774-40f3-9669-03147ab2a685
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 10
X-Served-Region: in
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_17807ea9-1849-41fd-a270-be1e1cf39c85","subject":"Across regions","status":"open","region":"eu","participants":["qa-3d208117a24c","qa-c51eb0aeec85"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-29T08:38:57.821729467Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-a9c42554-d6e4-4e8e-82c1-400e92af199f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a9c42554-d6e4-4e8e-82c1-400e92af199f
Content-Type: application/json

--- request body ---
{"handle":"qa-c51eb0aeec85","password":"****"}

--- response: 200 in 20 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-a9c42554-d6e4-4e8e-82c1-400e92af199f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_46fb8ebe-964b-49c3-bbb2-d8e457f6e7be"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_17807ea9-1849-41fd-a270-be1e1cf39c85
correlation: qa-1b6ed00c-96dc-4548-9bb9-bb67ee0f332c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1b6ed00c-96dc-4548-9bb9-bb67ee0f332c
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-1b6ed00c-96dc-4548-9bb9-bb67ee0f332c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_17807ea9-1849-41fd-a270-be1e1cf39c85","subject":"Across regions","status":"open","region":"eu","participants":["qa-3d208117a24c","qa-c51eb0aeec85"],"messageCount":1,"unreadCount":1,"createdAt":"2026-10-29T08:38:57.821729467Z"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-07ea91d6-2744-408b-ad06-50bb16e59805

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-07ea91d6-2744-408b-ad06-50bb16e59805
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-07ea91d6-2744-408b-ad06-50bb16e59805
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 10
X-Served-Region: eu
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-e6f61cde-351f-49a8-b7df-fbe1834d5595

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e6f61cde-351f-49a8-b7df-fbe1834d5595
Content-Type: application/json

--- request body ---
{"handle":"qa-c51eb0aeec85","password":"****"}

--- response: 401 in 16 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e6f61cde-351f-49a8-b7df-fbe1834d5595
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 570
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e6f61cde-351f-49a8-b7df-fbe1834d5595"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-59922950-b402-4377-a288-7d1ce459e138

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-59922950-b402-4377-a288-7d1ce459e138
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-59922950-b402-4377-a288-7d1ce459e138
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: in
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-a827b360-87e8-4072-a5dc-735990932554

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a827b360-87e8-4072-a5dc-735990932554
Content-Type: application/json

--- request body ---
{"handle":"qa-3d208117a24c","password":"****"}

--- response: 401 in 17 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a827b360-87e8-4072-a5dc-735990932554
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 566
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a827b360-87e8-4072-a5dc-735990932554"}
```
