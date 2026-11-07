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
| 1 | `POST /v1/accounts` | 201 | 305 | `qa-64b8f2f4-5776-4828-9408-fdba907f63df` |
| 2 | `POST /v1/accounts` | 201 | 63 | `qa-1beae8fa-8255-4faa-999c-64b412a3dc6c` |
| 3 | `POST /v1/auth/token` | 200 | 51 | `qa-2520788b-eca4-40e4-82f4-559b951772f7` |
| 4 | `POST /v1/conversations` | 201 | 41 | `qa-4fd0bed2-d9b4-44fa-b2b7-cfd55ace8b9e` |
| 5 | `GET /v1/conversations/{id}` | 200 | 33 | `qa-5e688b70-7d0f-4058-a2fe-22c9ea2bea01` |
| 6 | `POST /v1/auth/token` | 200 | 13 | `qa-a5e955d3-149a-46c1-a95b-b120094187b7` |
| 7 | `GET /v1/conversations/{id}` | 200 | 6 | `qa-304c29d4-834d-40c6-8eaf-109bf3f25b36` |
| 8 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-069b5503-bd74-4d36-96c6-9ef2025cf152` |
| 9 | `POST /v1/auth/token` | 401 | 7 | `qa-80d81944-dd2c-429c-9913-7029584ca1ca` |
| 10 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-f28dde74-f312-4835-a6fe-cd65918682c0` |
| 11 | `POST /v1/auth/token` | 401 | 5 | `qa-45057273-c0ec-4a5d-bb1d-8ae97a66e9c4` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-64b8f2f4-5776-4828-9408-fdba907f63df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-64b8f2f4-5776-4828-9408-fdba907f63df
Content-Type: application/json

--- request body ---
{"handle":"qa-320bc415ee84","displayName":"QA 320bc415ee84","password":"****","region":"in"}

--- response: 201 in 305 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-64b8f2f4-5776-4828-9408-fdba907f63df
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 10
Location: /v1/accounts/qa-320bc415ee84
X-Served-Region: in
Content-Length: 181

{"id":"acc_f3a35e6b-3118-49c7-ab43-0c649f708f5c","handle":"qa-320bc415ee84","displayName":"QA 320bc415ee84","region":"in","role":"user","createdAt":"2026-11-03T09:41:33.457836983Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-1beae8fa-8255-4faa-999c-64b412a3dc6c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1beae8fa-8255-4faa-999c-64b412a3dc6c
Content-Type: application/json

--- request body ---
{"handle":"qa-0eb01423885f","displayName":"QA 0eb01423885f","password":"****","region":"eu"}

--- response: 201 in 63 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-1beae8fa-8255-4faa-999c-64b412a3dc6c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 585
RateLimit-Reset: 10
Location: /v1/accounts/qa-0eb01423885f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4be2b050-098d-4fa1-b6f1-05873cda9853","handle":"qa-0eb01423885f","displayName":"QA 0eb01423885f","region":"eu","role":"user","createdAt":"2026-11-03T09:41:33.793680906Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-2520788b-eca4-40e4-82f4-559b951772f7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2520788b-eca4-40e4-82f4-559b951772f7
Content-Type: application/json

--- request body ---
{"handle":"qa-320bc415ee84","password":"****"}

--- response: 200 in 51 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-2520788b-eca4-40e4-82f4-559b951772f7
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f3a35e6b-3118-49c7-ab43-0c649f708f5c"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-4fd0bed2-d9b4-44fa-b2b7-cfd55ace8b9e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4fd0bed2-d9b4-44fa-b2b7-cfd55ace8b9e
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-0eb01423885f","subject":"Across regions","message":"Namaste"}

--- response: 201 in 41 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-4fd0bed2-d9b4-44fa-b2b7-cfd55ace8b9e
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
Location: /v1/conversations/cnv_9e112479-fbf4-4ce3-b737-e38a0abd4c3f
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_9e112479-fbf4-4ce3-b737-e38a0abd4c3f","subject":"Across regions","status":"open","region":"eu","participants":["qa-320bc415ee84","qa-0eb01423885f"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-03T09:41:33.937924177Z"}
```

## 5. GET /v1/conversations/{id}

```text
#5 GET http://localhost:7070/v1/conversations/cnv_9e112479-fbf4-4ce3-b737-e38a0abd4c3f
correlation: qa-5e688b70-7d0f-4058-a2fe-22c9ea2bea01

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5e688b70-7d0f-4058-a2fe-22c9ea2bea01
Content-Type: application/json

--- response: 200 in 33 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-5e688b70-7d0f-4058-a2fe-22c9ea2bea01
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

{"id":"cnv_9e112479-fbf4-4ce3-b737-e38a0abd4c3f","subject":"Across regions","status":"open","region":"eu","participants":["qa-320bc415ee84","qa-0eb01423885f"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-03T09:41:33.937924177Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-a5e955d3-149a-46c1-a95b-b120094187b7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a5e955d3-149a-46c1-a95b-b120094187b7
Content-Type: application/json

--- request body ---
{"handle":"qa-0eb01423885f","password":"****"}

--- response: 200 in 13 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-a5e955d3-149a-46c1-a95b-b120094187b7
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4be2b050-098d-4fa1-b6f1-05873cda9853"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_9e112479-fbf4-4ce3-b737-e38a0abd4c3f
correlation: qa-304c29d4-834d-40c6-8eaf-109bf3f25b36

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-304c29d4-834d-40c6-8eaf-109bf3f25b36
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-304c29d4-834d-40c6-8eaf-109bf3f25b36
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

{"id":"cnv_9e112479-fbf4-4ce3-b737-e38a0abd4c3f","subject":"Across regions","status":"open","region":"eu","participants":["qa-320bc415ee84","qa-0eb01423885f"],"messageCount":1,"unreadCount":1,"createdAt":"2026-11-03T09:41:33.937924177Z"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-069b5503-bd74-4d36-96c6-9ef2025cf152

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-069b5503-bd74-4d36-96c6-9ef2025cf152
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-069b5503-bd74-4d36-96c6-9ef2025cf152
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
correlation: qa-80d81944-dd2c-429c-9913-7029584ca1ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-80d81944-dd2c-429c-9913-7029584ca1ca
Content-Type: application/json

--- request body ---
{"handle":"qa-0eb01423885f","password":"****"}

--- response: 401 in 7 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-80d81944-dd2c-429c-9913-7029584ca1ca
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 571
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-80d81944-dd2c-429c-9913-7029584ca1ca"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f28dde74-f312-4835-a6fe-cd65918682c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f28dde74-f312-4835-a6fe-cd65918682c0
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f28dde74-f312-4835-a6fe-cd65918682c0
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
correlation: qa-45057273-c0ec-4a5d-bb1d-8ae97a66e9c4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-45057273-c0ec-4a5d-bb1d-8ae97a66e9c4
Content-Type: application/json

--- request body ---
{"handle":"qa-320bc415ee84","password":"****"}

--- response: 401 in 5 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-45057273-c0ec-4a5d-bb1d-8ae97a66e9c4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 567
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-45057273-c0ec-4a5d-bb1d-8ae97a66e9c4"}
```
