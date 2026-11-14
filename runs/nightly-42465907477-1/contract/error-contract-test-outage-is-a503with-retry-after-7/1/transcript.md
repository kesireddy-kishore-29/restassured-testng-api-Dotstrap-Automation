# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/conversations]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[7]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 33 | `qa-6aa38583-24c1-4f8d-ad59-ca92acaed1c4` |
| 2 | `POST /v1/accounts` | 201 | 18 | `qa-3c72e29f-a630-4977-b0c3-decfb8ac50cb` |
| 3 | `POST /v1/auth/token` | 200 | 20 | `qa-23a228a9-23cb-413b-9554-842a72e35b9a` |
| 4 | `POST /v1/conversations` | 201 | 7 | `qa-5c360488-19d7-44a8-a185-e27dbe341b2c` |
| 5 | `GET /v1/conversations` | 503 | 19 | `qa-0a31282d-c7b9-4455-9603-bf00cc44cbad` |
| 6 | `POST /v1/auth/token` | 200 | 19 | `qa-0f5eb183-a06e-460d-85c0-eb953896a8e5` |
| 7 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-e3afa423-5871-41ac-8d4f-a6888365c945` |
| 8 | `POST /v1/auth/token` | 401 | 22 | `qa-cc222ec9-a048-4e14-b211-f157f003a4d0` |
| 9 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-c2d8246c-d414-4e31-9cd7-da7b0f136584` |
| 10 | `POST /v1/auth/token` | 401 | 23 | `qa-c27740a2-4df2-49a2-a31a-e7325c65c07c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6aa38583-24c1-4f8d-ad59-ca92acaed1c4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6aa38583-24c1-4f8d-ad59-ca92acaed1c4
Content-Type: application/json

--- request body ---
{"handle":"qa-f62bfaaf1ba1","displayName":"QA f62bfaaf1ba1","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-6aa38583-24c1-4f8d-ad59-ca92acaed1c4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 474
RateLimit-Reset: 9
Location: /v1/accounts/qa-f62bfaaf1ba1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9d18d4f4-2708-494b-906a-2a15b4a816af","handle":"qa-f62bfaaf1ba1","displayName":"QA f62bfaaf1ba1","region":"eu","role":"user","createdAt":"2026-11-08T09:09:02.682115589Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-3c72e29f-a630-4977-b0c3-decfb8ac50cb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3c72e29f-a630-4977-b0c3-decfb8ac50cb
Content-Type: application/json

--- request body ---
{"handle":"qa-facfd4696974","displayName":"QA facfd4696974","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-3c72e29f-a630-4977-b0c3-decfb8ac50cb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 464
RateLimit-Reset: 9
Location: /v1/accounts/qa-facfd4696974
X-Served-Region: eu
Content-Length: 181

{"id":"acc_de5686d0-c92f-4d94-b63a-db990ee03cc2","handle":"qa-facfd4696974","displayName":"QA facfd4696974","region":"eu","role":"user","createdAt":"2026-11-08T09:09:02.705361351Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-23a228a9-23cb-413b-9554-842a72e35b9a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-23a228a9-23cb-413b-9554-842a72e35b9a
Content-Type: application/json

--- request body ---
{"handle":"qa-f62bfaaf1ba1","password":"****"}

--- response: 200 in 20 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-23a228a9-23cb-413b-9554-842a72e35b9a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 456
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9d18d4f4-2708-494b-906a-2a15b4a816af"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-5c360488-19d7-44a8-a185-e27dbe341b2c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5c360488-19d7-44a8-a185-e27dbe341b2c
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-facfd4696974","subject":"Error contract","message":"Hi"}

--- response: 201 in 7 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-5c360488-19d7-44a8-a185-e27dbe341b2c
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
Location: /v1/conversations/cnv_ed3ac39b-25bd-40de-a2ec-7e5d34653aac
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_ed3ac39b-25bd-40de-a2ec-7e5d34653aac","subject":"Error contract","status":"open","region":"eu","participants":["qa-f62bfaaf1ba1","qa-facfd4696974"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-08T09:09:02.736431913Z"}
```

## 5. GET /v1/conversations

```text
#5 GET http://localhost:7070/v1/conversations
correlation: qa-0a31282d-c7b9-4455-9603-bf00cc44cbad

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 69b9ad29-3113-4c0f-a50e-2aabe318659a
X-Correlation-Id: qa-0a31282d-c7b9-4455-9603-bf00cc44cbad
Content-Type: application/json

--- response: 503 in 19 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0a31282d-c7b9-4455-9603-bf00cc44cbad
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 261

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations","correlationId":"qa-0a31282d-c7b9-4455-9603-bf00cc44cbad"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-0f5eb183-a06e-460d-85c0-eb953896a8e5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f5eb183-a06e-460d-85c0-eb953896a8e5
Content-Type: application/json

--- request body ---
{"handle":"qa-facfd4696974","password":"****"}

--- response: 200 in 19 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-0f5eb183-a06e-460d-85c0-eb953896a8e5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 433
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_de5686d0-c92f-4d94-b63a-db990ee03cc2"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e3afa423-5871-41ac-8d4f-a6888365c945

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e3afa423-5871-41ac-8d4f-a6888365c945
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e3afa423-5871-41ac-8d4f-a6888365c945
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
correlation: qa-cc222ec9-a048-4e14-b211-f157f003a4d0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc222ec9-a048-4e14-b211-f157f003a4d0
Content-Type: application/json

--- request body ---
{"handle":"qa-facfd4696974","password":"****"}

--- response: 401 in 22 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cc222ec9-a048-4e14-b211-f157f003a4d0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 428
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cc222ec9-a048-4e14-b211-f157f003a4d0"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c2d8246c-d414-4e31-9cd7-da7b0f136584

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c2d8246c-d414-4e31-9cd7-da7b0f136584
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c2d8246c-d414-4e31-9cd7-da7b0f136584
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
correlation: qa-c27740a2-4df2-49a2-a31a-e7325c65c07c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c27740a2-4df2-49a2-a31a-e7325c65c07c
Content-Type: application/json

--- request body ---
{"handle":"qa-f62bfaaf1ba1","password":"****"}

--- response: 401 in 23 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c27740a2-4df2-49a2-a31a-e7325c65c07c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 415
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c27740a2-4df2-49a2-a31a-e7325c65c07c"}
```
