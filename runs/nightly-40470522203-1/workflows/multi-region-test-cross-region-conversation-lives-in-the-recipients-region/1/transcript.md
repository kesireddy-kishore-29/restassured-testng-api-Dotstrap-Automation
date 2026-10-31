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
| 1 | `POST /v1/accounts` | 201 | 477 | `qa-7c357dc6-1d0b-4e17-bf17-6072f2354648` |
| 2 | `POST /v1/accounts` | 201 | 115 | `qa-e52710a4-77d8-41ed-9b86-999c23fc6c1e` |
| 3 | `POST /v1/auth/token` | 200 | 42 | `qa-e5872c59-0a68-4131-a9ea-43d9776e4a1c` |
| 4 | `POST /v1/conversations` | 201 | 97 | `qa-108e0a4e-6d63-4cdd-b527-4123c75c86ba` |
| 5 | `GET /v1/conversations/{id}` | 200 | 37 | `qa-7e129d27-d3b1-4f7c-ad86-e8a4a7331814` |
| 6 | `POST /v1/auth/token` | 200 | 19 | `qa-e407ddb1-39e2-485c-bee7-c3e978d08558` |
| 7 | `GET /v1/conversations/{id}` | 200 | 8 | `qa-7411c819-3738-4857-82be-a01ec17f725a` |
| 8 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-d1e4a81d-ebfb-4fae-98d6-1740117a72c1` |
| 9 | `POST /v1/auth/token` | 401 | 32 | `qa-47f2552b-e104-4183-8165-69de58405d71` |
| 10 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-d7422b20-d718-4e2b-a0f5-f3505005ecc1` |
| 11 | `POST /v1/auth/token` | 401 | 20 | `qa-39800166-b6b6-4045-a1db-fad3197e7bcf` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-7c357dc6-1d0b-4e17-bf17-6072f2354648

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7c357dc6-1d0b-4e17-bf17-6072f2354648
Content-Type: application/json

--- request body ---
{"handle":"qa-3cfa44790af7","displayName":"QA 3cfa44790af7","password":"****","region":"in"}

--- response: 201 in 477 ms ---
Date: Tue, 27 Oct 2026 08:00:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-7c357dc6-1d0b-4e17-bf17-6072f2354648
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 10
Location: /v1/accounts/qa-3cfa44790af7
X-Served-Region: in
Content-Length: 181

{"id":"acc_e92708f3-70d2-46a3-949b-4475512075ff","handle":"qa-3cfa44790af7","displayName":"QA 3cfa44790af7","region":"in","role":"user","createdAt":"2026-10-27T08:00:33.307757569Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-e52710a4-77d8-41ed-9b86-999c23fc6c1e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e52710a4-77d8-41ed-9b86-999c23fc6c1e
Content-Type: application/json

--- request body ---
{"handle":"qa-a6876dda96a6","displayName":"QA a6876dda96a6","password":"****","region":"eu"}

--- response: 201 in 115 ms ---
Date: Tue, 27 Oct 2026 08:00:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-e52710a4-77d8-41ed-9b86-999c23fc6c1e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 594
RateLimit-Reset: 10
Location: /v1/accounts/qa-a6876dda96a6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_46af139f-9a7d-4d67-955a-d76e3e90b6f9","handle":"qa-a6876dda96a6","displayName":"QA a6876dda96a6","region":"eu","role":"user","createdAt":"2026-10-27T08:00:33.831567653Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-e5872c59-0a68-4131-a9ea-43d9776e4a1c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e5872c59-0a68-4131-a9ea-43d9776e4a1c
Content-Type: application/json

--- request body ---
{"handle":"qa-3cfa44790af7","password":"****"}

--- response: 200 in 42 ms ---
Date: Tue, 27 Oct 2026 08:00:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-e5872c59-0a68-4131-a9ea-43d9776e4a1c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 582
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e92708f3-70d2-46a3-949b-4475512075ff"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-108e0a4e-6d63-4cdd-b527-4123c75c86ba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-108e0a4e-6d63-4cdd-b527-4123c75c86ba
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-a6876dda96a6","subject":"Across regions","message":"Namaste"}

--- response: 201 in 97 ms ---
Date: Tue, 27 Oct 2026 08:00:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-108e0a4e-6d63-4cdd-b527-4123c75c86ba
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
Location: /v1/conversations/cnv_ea2de043-b631-4330-b2ea-c1c243e77459
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_ea2de043-b631-4330-b2ea-c1c243e77459","subject":"Across regions","status":"open","region":"eu","participants":["qa-3cfa44790af7","qa-a6876dda96a6"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-27T08:00:34.030560192Z"}
```

## 5. GET /v1/conversations/{id}

```text
#5 GET http://localhost:7070/v1/conversations/cnv_ea2de043-b631-4330-b2ea-c1c243e77459
correlation: qa-7e129d27-d3b1-4f7c-ad86-e8a4a7331814

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7e129d27-d3b1-4f7c-ad86-e8a4a7331814
Content-Type: application/json

--- response: 200 in 37 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-7e129d27-d3b1-4f7c-ad86-e8a4a7331814
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

{"id":"cnv_ea2de043-b631-4330-b2ea-c1c243e77459","subject":"Across regions","status":"open","region":"eu","participants":["qa-3cfa44790af7","qa-a6876dda96a6"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-27T08:00:34.030560192Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-e407ddb1-39e2-485c-bee7-c3e978d08558

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e407ddb1-39e2-485c-bee7-c3e978d08558
Content-Type: application/json

--- request body ---
{"handle":"qa-a6876dda96a6","password":"****"}

--- response: 200 in 19 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-e407ddb1-39e2-485c-bee7-c3e978d08558
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_46af139f-9a7d-4d67-955a-d76e3e90b6f9"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_ea2de043-b631-4330-b2ea-c1c243e77459
correlation: qa-7411c819-3738-4857-82be-a01ec17f725a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7411c819-3738-4857-82be-a01ec17f725a
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-7411c819-3738-4857-82be-a01ec17f725a
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

{"id":"cnv_ea2de043-b631-4330-b2ea-c1c243e77459","subject":"Across regions","status":"open","region":"eu","participants":["qa-3cfa44790af7","qa-a6876dda96a6"],"messageCount":1,"unreadCount":1,"createdAt":"2026-10-27T08:00:34.030560192Z"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d1e4a81d-ebfb-4fae-98d6-1740117a72c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d1e4a81d-ebfb-4fae-98d6-1740117a72c1
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d1e4a81d-ebfb-4fae-98d6-1740117a72c1
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
correlation: qa-47f2552b-e104-4183-8165-69de58405d71

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-47f2552b-e104-4183-8165-69de58405d71
Content-Type: application/json

--- request body ---
{"handle":"qa-a6876dda96a6","password":"****"}

--- response: 401 in 32 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-47f2552b-e104-4183-8165-69de58405d71
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-47f2552b-e104-4183-8165-69de58405d71"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d7422b20-d718-4e2b-a0f5-f3505005ecc1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d7422b20-d718-4e2b-a0f5-f3505005ecc1
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d7422b20-d718-4e2b-a0f5-f3505005ecc1
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
correlation: qa-39800166-b6b6-4045-a1db-fad3197e7bcf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-39800166-b6b6-4045-a1db-fad3197e7bcf
Content-Type: application/json

--- request body ---
{"handle":"qa-3cfa44790af7","password":"****"}

--- response: 401 in 20 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-39800166-b6b6-4045-a1db-fad3197e7bcf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-39800166-b6b6-4045-a1db-fad3197e7bcf"}
```
