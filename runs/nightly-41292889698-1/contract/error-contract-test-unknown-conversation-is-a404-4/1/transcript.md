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
| 1 | `POST /v1/accounts` | 201 | 10 | `qa-f11479ab-f1bd-4c6c-8582-2dabd4fea2a8` |
| 2 | `POST /v1/auth/token` | 200 | 17 | `qa-d0648de2-19e0-48d0-92b2-8faa90e1f4a7` |
| 3 | `POST /v1/conversations/{id}/close` | 404 | 7 | `qa-8c4cbbfd-3e42-4781-9235-6f0acc7ff1a9` |
| 4 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-acba2ccc-055c-452d-8c67-36bb61901d2c` |
| 5 | `POST /v1/auth/token` | 401 | 10 | `qa-903490cb-729e-4106-9d9d-7d0bffbd9d77` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f11479ab-f1bd-4c6c-8582-2dabd4fea2a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f11479ab-f1bd-4c6c-8582-2dabd4fea2a8
Content-Type: application/json

--- request body ---
{"handle":"qa-00ebb8e24adc","displayName":"QA 00ebb8e24adc","password":"****","region":"eu"}

--- response: 201 in 10 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-f11479ab-f1bd-4c6c-8582-2dabd4fea2a8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 298
RateLimit-Reset: 6
Location: /v1/accounts/qa-00ebb8e24adc
X-Served-Region: eu
Content-Length: 181

{"id":"acc_85714f85-aa7d-43b5-b3c1-1279f6f0e0a6","handle":"qa-00ebb8e24adc","displayName":"QA 00ebb8e24adc","region":"eu","role":"user","createdAt":"2026-11-01T09:23:24.512874619Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-d0648de2-19e0-48d0-92b2-8faa90e1f4a7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d0648de2-19e0-48d0-92b2-8faa90e1f4a7
Content-Type: application/json

--- request body ---
{"handle":"qa-00ebb8e24adc","password":"****"}

--- response: 200 in 17 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-d0648de2-19e0-48d0-92b2-8faa90e1f4a7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 296
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_85714f85-aa7d-43b5-b3c1-1279f6f0e0a6"}
```

## 3. POST /v1/conversations/{id}/close

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/close
correlation: qa-8c4cbbfd-3e42-4781-9235-6f0acc7ff1a9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c4cbbfd-3e42-4781-9235-6f0acc7ff1a9
Content-Type: application/json

--- response: 404 in 7 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8c4cbbfd-3e42-4781-9235-6f0acc7ff1a9
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/close","correlationId":"qa-8c4cbbfd-3e42-4781-9235-6f0acc7ff1a9"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-acba2ccc-055c-452d-8c67-36bb61901d2c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-acba2ccc-055c-452d-8c67-36bb61901d2c
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: text/plain
X-Correlation-Id: qa-acba2ccc-055c-452d-8c67-36bb61901d2c
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
correlation: qa-903490cb-729e-4106-9d9d-7d0bffbd9d77

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-903490cb-729e-4106-9d9d-7d0bffbd9d77
Content-Type: application/json

--- request body ---
{"handle":"qa-00ebb8e24adc","password":"****"}

--- response: 401 in 10 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-903490cb-729e-4106-9d9d-7d0bffbd9d77
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 288
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-903490cb-729e-4106-9d9d-7d0bffbd9d77"}
```
