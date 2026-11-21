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
| 1 | `POST /v1/accounts` | 201 | 21 | `qa-1c5aeaa8-8523-4bdf-bd54-0b7c881445bf` |
| 2 | `POST /v1/auth/token` | 200 | 17 | `qa-5de44edd-8a8c-49c2-ad44-34bde9e435ac` |
| 3 | `GET /v1/conversations/{id}` | 404 | 9 | `qa-73487f07-60bf-453f-9961-e559e82a6854` |
| 4 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-900e6143-9643-41ae-aeef-7297edc0e4e2` |
| 5 | `POST /v1/auth/token` | 401 | 14 | `qa-e9893d1f-af49-4dbd-bbd7-d6060639c65d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-1c5aeaa8-8523-4bdf-bd54-0b7c881445bf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1c5aeaa8-8523-4bdf-bd54-0b7c881445bf
Content-Type: application/json

--- request body ---
{"handle":"qa-f09ec8a10e87","displayName":"QA f09ec8a10e87","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Sat, 14 Nov 2026 09:05:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-1c5aeaa8-8523-4bdf-bd54-0b7c881445bf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 289
RateLimit-Reset: 6
Location: /v1/accounts/qa-f09ec8a10e87
X-Served-Region: eu
Content-Length: 181

{"id":"acc_315392e8-8a68-44e9-9512-c248710784cd","handle":"qa-f09ec8a10e87","displayName":"QA f09ec8a10e87","region":"eu","role":"user","createdAt":"2026-11-14T09:05:13.034328194Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-5de44edd-8a8c-49c2-ad44-34bde9e435ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5de44edd-8a8c-49c2-ad44-34bde9e435ac
Content-Type: application/json

--- request body ---
{"handle":"qa-f09ec8a10e87","password":"****"}

--- response: 200 in 17 ms ---
Date: Sat, 14 Nov 2026 09:05:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-5de44edd-8a8c-49c2-ad44-34bde9e435ac
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 285
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_315392e8-8a68-44e9-9512-c248710784cd"}
```

## 3. GET /v1/conversations/{id}

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist
correlation: qa-73487f07-60bf-453f-9961-e559e82a6854

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-73487f07-60bf-453f-9961-e559e82a6854
Content-Type: application/json

--- response: 404 in 9 ms ---
Date: Sat, 14 Nov 2026 09:05:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-73487f07-60bf-453f-9961-e559e82a6854
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist","correlationId":"qa-73487f07-60bf-453f-9961-e559e82a6854"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-900e6143-9643-41ae-aeef-7297edc0e4e2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-900e6143-9643-41ae-aeef-7297edc0e4e2
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Sat, 14 Nov 2026 09:05:13 GMT
Content-Type: text/plain
X-Correlation-Id: qa-900e6143-9643-41ae-aeef-7297edc0e4e2
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
correlation: qa-e9893d1f-af49-4dbd-bbd7-d6060639c65d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e9893d1f-af49-4dbd-bbd7-d6060639c65d
Content-Type: application/json

--- request body ---
{"handle":"qa-f09ec8a10e87","password":"****"}

--- response: 401 in 14 ms ---
Date: Sat, 14 Nov 2026 09:05:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e9893d1f-af49-4dbd-bbd7-d6060639c65d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 278
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e9893d1f-af49-4dbd-bbd7-d6060639c65d"}
```
