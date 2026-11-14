# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/accounts/{handle}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[5]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 18 | `qa-4b4ccba3-528e-4bd2-8d7c-e65f9c20d072` |
| 2 | `POST /v1/accounts` | 201 | 19 | `qa-37593cc0-3b78-494c-be4a-6842824a5a1a` |
| 3 | `POST /v1/auth/token` | 200 | 32 | `qa-b3376b6c-0baf-4f9a-9249-1ed0f5b778f8` |
| 4 | `POST /v1/conversations` | 201 | 33 | `qa-7f48bc3b-66b2-442d-ad50-7d1ca7357f8f` |
| 5 | `GET /v1/accounts/{handle}` | 503 | 24 | `qa-826de636-7bee-4d9d-8292-ed1978cb1cc8` |
| 6 | `POST /v1/auth/token` | 200 | 25 | `qa-50dd75ec-b510-48ce-b75e-76381e41a206` |
| 7 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-ee3f31c1-c855-4012-9672-692c3bb1b151` |
| 8 | `POST /v1/auth/token` | 401 | 14 | `qa-a26f43a4-2017-4c52-a9b6-8d55277bea98` |
| 9 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-27089314-ed56-4140-948f-6cc4db316a2a` |
| 10 | `POST /v1/auth/token` | 401 | 17 | `qa-833fa4ef-8b22-4c62-814e-c57c9b740ef8` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-4b4ccba3-528e-4bd2-8d7c-e65f9c20d072

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4b4ccba3-528e-4bd2-8d7c-e65f9c20d072
Content-Type: application/json

--- request body ---
{"handle":"qa-7b3be4edf250","displayName":"QA 7b3be4edf250","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-4b4ccba3-528e-4bd2-8d7c-e65f9c20d072
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 481
RateLimit-Reset: 8
Location: /v1/accounts/qa-7b3be4edf250
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8b4e9a3a-1411-4dd8-9912-3e3c2851b9b0","handle":"qa-7b3be4edf250","displayName":"QA 7b3be4edf250","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.369485075Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-37593cc0-3b78-494c-be4a-6842824a5a1a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-37593cc0-3b78-494c-be4a-6842824a5a1a
Content-Type: application/json

--- request body ---
{"handle":"qa-bb365e551005","displayName":"QA bb365e551005","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-37593cc0-3b78-494c-be4a-6842824a5a1a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 467
RateLimit-Reset: 8
Location: /v1/accounts/qa-bb365e551005
X-Served-Region: eu
Content-Length: 181

{"id":"acc_13298d30-06d1-4d91-b66b-6e07c92a761d","handle":"qa-bb365e551005","displayName":"QA bb365e551005","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.415176546Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-b3376b6c-0baf-4f9a-9249-1ed0f5b778f8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b3376b6c-0baf-4f9a-9249-1ed0f5b778f8
Content-Type: application/json

--- request body ---
{"handle":"qa-7b3be4edf250","password":"****"}

--- response: 200 in 32 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-b3376b6c-0baf-4f9a-9249-1ed0f5b778f8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 460
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8b4e9a3a-1411-4dd8-9912-3e3c2851b9b0"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-7f48bc3b-66b2-442d-ad50-7d1ca7357f8f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7f48bc3b-66b2-442d-ad50-7d1ca7357f8f
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-bb365e551005","subject":"Error contract","message":"Hi"}

--- response: 201 in 33 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-7f48bc3b-66b2-442d-ad50-7d1ca7357f8f
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
Location: /v1/conversations/cnv_a36e5659-9caf-4301-8e4b-e0c1004ad1c3
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_a36e5659-9caf-4301-8e4b-e0c1004ad1c3","subject":"Error contract","status":"open","region":"eu","participants":["qa-7b3be4edf250","qa-bb365e551005"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-10T09:59:36.510516206Z"}
```

## 5. GET /v1/accounts/{handle}

```text
#5 GET http://localhost:7070/v1/accounts/qa-7b3be4edf250
correlation: qa-826de636-7bee-4d9d-8292-ed1978cb1cc8

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 556d09f3-5e69-44ba-a47f-9fe332700696
X-Correlation-Id: qa-826de636-7bee-4d9d-8292-ed1978cb1cc8
Content-Type: application/json

--- response: 503 in 24 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-826de636-7bee-4d9d-8292-ed1978cb1cc8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 272

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/qa-7b3be4edf250","correlationId":"qa-826de636-7bee-4d9d-8292-ed1978cb1cc8"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-50dd75ec-b510-48ce-b75e-76381e41a206

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-50dd75ec-b510-48ce-b75e-76381e41a206
Content-Type: application/json

--- request body ---
{"handle":"qa-bb365e551005","password":"****"}

--- response: 200 in 25 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-50dd75ec-b510-48ce-b75e-76381e41a206
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 432
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_13298d30-06d1-4d91-b66b-6e07c92a761d"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ee3f31c1-c855-4012-9672-692c3bb1b151

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee3f31c1-c855-4012-9672-692c3bb1b151
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ee3f31c1-c855-4012-9672-692c3bb1b151
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
correlation: qa-a26f43a4-2017-4c52-a9b6-8d55277bea98

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a26f43a4-2017-4c52-a9b6-8d55277bea98
Content-Type: application/json

--- request body ---
{"handle":"qa-bb365e551005","password":"****"}

--- response: 401 in 14 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a26f43a4-2017-4c52-a9b6-8d55277bea98
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 419
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a26f43a4-2017-4c52-a9b6-8d55277bea98"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-27089314-ed56-4140-948f-6cc4db316a2a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-27089314-ed56-4140-948f-6cc4db316a2a
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-27089314-ed56-4140-948f-6cc4db316a2a
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
correlation: qa-833fa4ef-8b22-4c62-814e-c57c9b740ef8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-833fa4ef-8b22-4c62-814e-c57c9b740ef8
Content-Type: application/json

--- request body ---
{"handle":"qa-7b3be4edf250","password":"****"}

--- response: 401 in 17 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-833fa4ef-8b22-4c62-814e-c57c9b740ef8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 414
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-833fa4ef-8b22-4c62-814e-c57c9b740ef8"}
```
