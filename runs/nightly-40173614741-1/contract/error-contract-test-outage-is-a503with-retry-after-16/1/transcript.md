# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/admin/stats]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[16]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 37 | `qa-093d7928-99f2-4a65-aecf-886df8f47154` |
| 2 | `POST /v1/accounts` | 201 | 25 | `qa-2f06bcc2-8a8a-4393-9fe4-15e594e47d9d` |
| 3 | `POST /v1/auth/token` | 200 | 28 | `qa-1bf15cfe-cccc-4042-951f-4ee0dc838f2e` |
| 4 | `POST /v1/conversations` | 201 | 12 | `qa-df3ad3f0-fa13-4687-9128-92d10da9c38b` |
| 5 | `GET /v1/admin/stats` | 503 | 6 | `qa-ac2d5d86-fda8-4854-86f5-979ea626b00c` |
| 6 | `POST /v1/auth/token` | 200 | 20 | `qa-a05d2fda-f7cb-4127-ab92-6c7c1e033097` |
| 7 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-8e9a3259-9457-43d6-a95f-00a9406e3cef` |
| 8 | `POST /v1/auth/token` | 401 | 5 | `qa-6e464be7-7e0c-46cd-a5e9-67e0319deca5` |
| 9 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-97894286-ac53-497e-8842-eda4f80c0c4c` |
| 10 | `POST /v1/auth/token` | 401 | 5 | `qa-b287e908-c5c2-41a2-b2d6-9e8bb9b168d5` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-093d7928-99f2-4a65-aecf-886df8f47154

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-093d7928-99f2-4a65-aecf-886df8f47154
Content-Type: application/json

--- request body ---
{"handle":"qa-03cac2b74300","displayName":"QA 03cac2b74300","password":"****","region":"eu"}

--- response: 201 in 37 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-093d7928-99f2-4a65-aecf-886df8f47154
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 326
RateLimit-Reset: 6
Location: /v1/accounts/qa-03cac2b74300
X-Served-Region: eu
Content-Length: 181

{"id":"acc_67da85de-43ee-41ef-b6d4-1abe7e951dec","handle":"qa-03cac2b74300","displayName":"QA 03cac2b74300","region":"eu","role":"user","createdAt":"2026-10-25T07:40:27.070331178Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-2f06bcc2-8a8a-4393-9fe4-15e594e47d9d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2f06bcc2-8a8a-4393-9fe4-15e594e47d9d
Content-Type: application/json

--- request body ---
{"handle":"qa-cd33a421b9d0","displayName":"QA cd33a421b9d0","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-2f06bcc2-8a8a-4393-9fe4-15e594e47d9d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 321
RateLimit-Reset: 6
Location: /v1/accounts/qa-cd33a421b9d0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_054b42eb-5eb7-48f6-ae7e-29f590ed2d8d","handle":"qa-cd33a421b9d0","displayName":"QA cd33a421b9d0","region":"eu","role":"user","createdAt":"2026-10-25T07:40:27.110646762Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-1bf15cfe-cccc-4042-951f-4ee0dc838f2e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1bf15cfe-cccc-4042-951f-4ee0dc838f2e
Content-Type: application/json

--- request body ---
{"handle":"qa-03cac2b74300","password":"****"}

--- response: 200 in 28 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-1bf15cfe-cccc-4042-951f-4ee0dc838f2e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 316
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_67da85de-43ee-41ef-b6d4-1abe7e951dec"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-df3ad3f0-fa13-4687-9128-92d10da9c38b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df3ad3f0-fa13-4687-9128-92d10da9c38b
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-cd33a421b9d0","subject":"Error contract","message":"Hi"}

--- response: 201 in 12 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-df3ad3f0-fa13-4687-9128-92d10da9c38b
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
Location: /v1/conversations/cnv_befa8647-ac76-40ea-b66b-62852b153b4b
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_befa8647-ac76-40ea-b66b-62852b153b4b","subject":"Error contract","status":"open","region":"eu","participants":["qa-03cac2b74300","qa-cd33a421b9d0"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-25T07:40:27.164522349Z"}
```

## 5. GET /v1/admin/stats

```text
#5 GET http://localhost:7070/v1/admin/stats
correlation: qa-ac2d5d86-fda8-4854-86f5-979ea626b00c

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 68334917-c9dc-442a-afe0-d4cae2dae501
X-Correlation-Id: qa-ac2d5d86-fda8-4854-86f5-979ea626b00c
Content-Type: application/json

--- response: 503 in 6 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ac2d5d86-fda8-4854-86f5-979ea626b00c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/admin/stats","correlationId":"qa-ac2d5d86-fda8-4854-86f5-979ea626b00c"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-a05d2fda-f7cb-4127-ab92-6c7c1e033097

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a05d2fda-f7cb-4127-ab92-6c7c1e033097
Content-Type: application/json

--- request body ---
{"handle":"qa-cd33a421b9d0","password":"****"}

--- response: 200 in 20 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-a05d2fda-f7cb-4127-ab92-6c7c1e033097
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 306
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_054b42eb-5eb7-48f6-ae7e-29f590ed2d8d"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8e9a3259-9457-43d6-a95f-00a9406e3cef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e9a3259-9457-43d6-a95f-00a9406e3cef
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8e9a3259-9457-43d6-a95f-00a9406e3cef
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
correlation: qa-6e464be7-7e0c-46cd-a5e9-67e0319deca5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6e464be7-7e0c-46cd-a5e9-67e0319deca5
Content-Type: application/json

--- request body ---
{"handle":"qa-cd33a421b9d0","password":"****"}

--- response: 401 in 5 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6e464be7-7e0c-46cd-a5e9-67e0319deca5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 303
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6e464be7-7e0c-46cd-a5e9-67e0319deca5"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-97894286-ac53-497e-8842-eda4f80c0c4c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-97894286-ac53-497e-8842-eda4f80c0c4c
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: text/plain
X-Correlation-Id: qa-97894286-ac53-497e-8842-eda4f80c0c4c
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

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-b287e908-c5c2-41a2-b2d6-9e8bb9b168d5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b287e908-c5c2-41a2-b2d6-9e8bb9b168d5
Content-Type: application/json

--- request body ---
{"handle":"qa-03cac2b74300","password":"****"}

--- response: 401 in 5 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b287e908-c5c2-41a2-b2d6-9e8bb9b168d5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 301
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b287e908-c5c2-41a2-b2d6-9e8bb9b168d5"}
```
