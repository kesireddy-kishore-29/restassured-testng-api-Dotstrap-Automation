# Transcript: Every conversation operation answers an unknown id with a 404 problem [GET /v1/conversations/{id}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#unknownConversationIsA404[0]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 31 | `qa-af98e4dd-4a74-4690-882f-2eb89dfe5555` |
| 2 | `POST /v1/auth/token` | 200 | 16 | `qa-90c9f059-abf5-480d-a011-71825dd074b0` |
| 3 | `GET /v1/conversations/{id}` | 404 | 24 | `qa-49d8c8aa-b3ba-4c9d-9a0b-b03372019adc` |
| 4 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-09c52f4c-d79c-4e5c-8649-34dc0cdb260a` |
| 5 | `POST /v1/auth/token` | 401 | 10 | `qa-dc3cfc19-6267-4a5e-ae9b-11434d30b8c5` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-af98e4dd-4a74-4690-882f-2eb89dfe5555

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-af98e4dd-4a74-4690-882f-2eb89dfe5555
Content-Type: application/json

--- request body ---
{"handle":"qa-ef9d9767d133","displayName":"QA ef9d9767d133","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-af98e4dd-4a74-4690-882f-2eb89dfe5555
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 289
RateLimit-Reset: 5
Location: /v1/accounts/qa-ef9d9767d133
X-Served-Region: eu
Content-Length: 181

{"id":"acc_31900f64-78dd-4126-8450-d7ba9d255da0","handle":"qa-ef9d9767d133","displayName":"QA ef9d9767d133","region":"eu","role":"user","createdAt":"2026-10-23T07:41:47.663071714Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-90c9f059-abf5-480d-a011-71825dd074b0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-90c9f059-abf5-480d-a011-71825dd074b0
Content-Type: application/json

--- request body ---
{"handle":"qa-ef9d9767d133","password":"****"}

--- response: 200 in 16 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-90c9f059-abf5-480d-a011-71825dd074b0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 282
RateLimit-Reset: 5
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_31900f64-78dd-4126-8450-d7ba9d255da0"}
```

## 3. GET /v1/conversations/{id}

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist
correlation: qa-49d8c8aa-b3ba-4c9d-9a0b-b03372019adc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-49d8c8aa-b3ba-4c9d-9a0b-b03372019adc
Content-Type: application/json

--- response: 404 in 24 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-49d8c8aa-b3ba-4c9d-9a0b-b03372019adc
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
Content-Length: 253

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist","correlationId":"qa-49d8c8aa-b3ba-4c9d-9a0b-b03372019adc"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-09c52f4c-d79c-4e5c-8649-34dc0cdb260a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-09c52f4c-d79c-4e5c-8649-34dc0cdb260a
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-09c52f4c-d79c-4e5c-8649-34dc0cdb260a
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

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-dc3cfc19-6267-4a5e-ae9b-11434d30b8c5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc3cfc19-6267-4a5e-ae9b-11434d30b8c5
Content-Type: application/json

--- request body ---
{"handle":"qa-ef9d9767d133","password":"****"}

--- response: 401 in 10 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dc3cfc19-6267-4a5e-ae9b-11434d30b8c5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 278
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-dc3cfc19-6267-4a5e-ae9b-11434d30b8c5"}
```
