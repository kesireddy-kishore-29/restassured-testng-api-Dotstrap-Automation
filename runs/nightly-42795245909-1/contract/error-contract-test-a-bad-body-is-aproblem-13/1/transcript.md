# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations/{id}/messages, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[13]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 29 | `qa-848db183-3350-425e-ab6b-3a1065e177ba` |
| 2 | `POST /v1/accounts` | 201 | 25 | `qa-f8a5978f-bb9f-41a8-8685-b124684b0ddb` |
| 3 | `POST /v1/auth/token` | 200 | 21 | `qa-60f57402-038a-4dde-a319-c5cbb5b65f69` |
| 4 | `POST /v1/conversations` | 201 | 17 | `qa-edc6799f-baeb-44fc-b537-8396d5fe0b22` |
| 5 | `POST /v1/conversations/{id}/messages` | 415 | 19 | `qa-d02ab107-8d43-4019-80bc-3cb944f5f9d2` |
| 6 | `POST /v1/auth/token` | 200 | 50 | `qa-f01270e9-4381-436a-9631-3953a7e0ad4e` |
| 7 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-3e96107b-c342-49a0-a2f6-c42928caead9` |
| 8 | `POST /v1/auth/token` | 401 | 12 | `qa-81730879-b362-483b-9c58-6fd9ce5eee1c` |
| 9 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-ef1995cf-8f72-4495-94f4-7f7f6999405f` |
| 10 | `POST /v1/auth/token` | 401 | 15 | `qa-bb9d5dc6-2395-4d29-b7f7-ba85c63e75b3` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-848db183-3350-425e-ab6b-3a1065e177ba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-848db183-3350-425e-ab6b-3a1065e177ba
Content-Type: application/json

--- request body ---
{"handle":"qa-1c471ce9762e","displayName":"QA 1c471ce9762e","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-848db183-3350-425e-ab6b-3a1065e177ba
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 360
RateLimit-Reset: 7
Location: /v1/accounts/qa-1c471ce9762e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c9923f0b-3d56-4649-86c4-21060d790d13","handle":"qa-1c471ce9762e","displayName":"QA 1c471ce9762e","region":"eu","role":"user","createdAt":"2026-11-10T09:59:37.266211915Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-f8a5978f-bb9f-41a8-8685-b124684b0ddb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f8a5978f-bb9f-41a8-8685-b124684b0ddb
Content-Type: application/json

--- request body ---
{"handle":"qa-554a6b690972","displayName":"QA 554a6b690972","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-f8a5978f-bb9f-41a8-8685-b124684b0ddb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 356
RateLimit-Reset: 7
Location: /v1/accounts/qa-554a6b690972
X-Served-Region: eu
Content-Length: 181

{"id":"acc_df00f2cb-0d8d-4bda-8fc7-e4c402c07a10","handle":"qa-554a6b690972","displayName":"QA 554a6b690972","region":"eu","role":"user","createdAt":"2026-11-10T09:59:37.295301411Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-60f57402-038a-4dde-a319-c5cbb5b65f69

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-60f57402-038a-4dde-a319-c5cbb5b65f69
Content-Type: application/json

--- request body ---
{"handle":"qa-1c471ce9762e","password":"****"}

--- response: 200 in 21 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-60f57402-038a-4dde-a319-c5cbb5b65f69
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 349
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c9923f0b-3d56-4649-86c4-21060d790d13"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-edc6799f-baeb-44fc-b537-8396d5fe0b22

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-edc6799f-baeb-44fc-b537-8396d5fe0b22
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-554a6b690972","subject":"Error contract","message":"Hi"}

--- response: 201 in 17 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-edc6799f-baeb-44fc-b537-8396d5fe0b22
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
Location: /v1/conversations/cnv_52a4f240-15c4-461e-ac28-472f0ba4dea0
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_52a4f240-15c4-461e-ac28-472f0ba4dea0","subject":"Error contract","status":"open","region":"eu","participants":["qa-1c471ce9762e","qa-554a6b690972"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-10T09:59:37.357455877Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_52a4f240-15c4-461e-ac28-472f0ba4dea0/messages
correlation: qa-d02ab107-8d43-4019-80bc-3cb944f5f9d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d02ab107-8d43-4019-80bc-3cb944f5f9d2
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 19 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d02ab107-8d43-4019-80bc-3cb944f5f9d2
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
Content-Length: 307

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/conversations/cnv_52a4f240-15c4-461e-ac28-472f0ba4dea0/messages","correlationId":"qa-d02ab107-8d43-4019-80bc-3cb944f5f9d2"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-f01270e9-4381-436a-9631-3953a7e0ad4e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f01270e9-4381-436a-9631-3953a7e0ad4e
Content-Type: application/json

--- request body ---
{"handle":"qa-554a6b690972","password":"****"}

--- response: 200 in 50 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-f01270e9-4381-436a-9631-3953a7e0ad4e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 334
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_df00f2cb-0d8d-4bda-8fc7-e4c402c07a10"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3e96107b-c342-49a0-a2f6-c42928caead9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3e96107b-c342-49a0-a2f6-c42928caead9
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3e96107b-c342-49a0-a2f6-c42928caead9
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
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-81730879-b362-483b-9c58-6fd9ce5eee1c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-81730879-b362-483b-9c58-6fd9ce5eee1c
Content-Type: application/json

--- request body ---
{"handle":"qa-554a6b690972","password":"****"}

--- response: 401 in 12 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-81730879-b362-483b-9c58-6fd9ce5eee1c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 329
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-81730879-b362-483b-9c58-6fd9ce5eee1c"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ef1995cf-8f72-4495-94f4-7f7f6999405f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef1995cf-8f72-4495-94f4-7f7f6999405f
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ef1995cf-8f72-4495-94f4-7f7f6999405f
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
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-bb9d5dc6-2395-4d29-b7f7-ba85c63e75b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb9d5dc6-2395-4d29-b7f7-ba85c63e75b3
Content-Type: application/json

--- request body ---
{"handle":"qa-1c471ce9762e","password":"****"}

--- response: 401 in 15 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bb9d5dc6-2395-4d29-b7f7-ba85c63e75b3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 325
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bb9d5dc6-2395-4d29-b7f7-ba85c63e75b3"}
```
