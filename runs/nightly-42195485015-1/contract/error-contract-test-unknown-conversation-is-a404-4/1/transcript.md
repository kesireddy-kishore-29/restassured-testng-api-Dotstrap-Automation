# Transcript: Every conversation operation answers an unknown id with a 404 problem [POST /v1/conversations/{id}/close]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#unknownConversationIsA404[4]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 9 | `qa-2c659bcb-4aa7-45e6-bc52-87c921dba9ad` |
| 2 | `POST /v1/auth/token` | 200 | 9 | `qa-b47ab65d-94a1-45c7-9aac-430693af9dfe` |
| 3 | `POST /v1/conversations/{id}/close` | 404 | 7 | `qa-19a3104c-e7de-4380-8751-bbf88fbaa102` |
| 4 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-aea84373-2c8b-4e01-89e7-d44abffa3db4` |
| 5 | `POST /v1/auth/token` | 401 | 9 | `qa-de8b912c-063f-45d7-9ae3-80462cd3bc27` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2c659bcb-4aa7-45e6-bc52-87c921dba9ad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2c659bcb-4aa7-45e6-bc52-87c921dba9ad
Content-Type: application/json

--- request body ---
{"handle":"qa-a1b95d1a83e3","displayName":"QA a1b95d1a83e3","password":"****","region":"eu"}

--- response: 201 in 9 ms ---
Date: Fri, 06 Nov 2026 09:30:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-2c659bcb-4aa7-45e6-bc52-87c921dba9ad
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 275
RateLimit-Reset: 5
Location: /v1/accounts/qa-a1b95d1a83e3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8b2c74fd-b42e-4063-b54e-d046d09d2297","handle":"qa-a1b95d1a83e3","displayName":"QA a1b95d1a83e3","region":"eu","role":"user","createdAt":"2026-11-06T09:30:35.417459929Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-b47ab65d-94a1-45c7-9aac-430693af9dfe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b47ab65d-94a1-45c7-9aac-430693af9dfe
Content-Type: application/json

--- request body ---
{"handle":"qa-a1b95d1a83e3","password":"****"}

--- response: 200 in 9 ms ---
Date: Fri, 06 Nov 2026 09:30:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-b47ab65d-94a1-45c7-9aac-430693af9dfe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 273
RateLimit-Reset: 5
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8b2c74fd-b42e-4063-b54e-d046d09d2297"}
```

## 3. POST /v1/conversations/{id}/close

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/close
correlation: qa-19a3104c-e7de-4380-8751-bbf88fbaa102

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-19a3104c-e7de-4380-8751-bbf88fbaa102
Content-Type: application/json

--- response: 404 in 7 ms ---
Date: Fri, 06 Nov 2026 09:30:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-19a3104c-e7de-4380-8751-bbf88fbaa102
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
Content-Length: 259

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/close","correlationId":"qa-19a3104c-e7de-4380-8751-bbf88fbaa102"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-aea84373-2c8b-4e01-89e7-d44abffa3db4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aea84373-2c8b-4e01-89e7-d44abffa3db4
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Fri, 06 Nov 2026 09:30:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-aea84373-2c8b-4e01-89e7-d44abffa3db4
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
correlation: qa-de8b912c-063f-45d7-9ae3-80462cd3bc27

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-de8b912c-063f-45d7-9ae3-80462cd3bc27
Content-Type: application/json

--- request body ---
{"handle":"qa-a1b95d1a83e3","password":"****"}

--- response: 401 in 9 ms ---
Date: Fri, 06 Nov 2026 09:30:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-de8b912c-063f-45d7-9ae3-80462cd3bc27
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 271
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-de8b912c-063f-45d7-9ae3-80462cd3bc27"}
```
