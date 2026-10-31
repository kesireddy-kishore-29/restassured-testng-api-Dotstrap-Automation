# Transcript: Unknown conversations and handles are 404 problems

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.ValidationTest#unknownResourcesAre404` |
| Features | FEAT-ERR-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 6 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 621 | `qa-3919c439-3714-4f92-ba1d-fcfa2d7b06e7` |
| 2 | `POST /v1/auth/token` | 200 | 48 | `qa-af058f4c-028c-43b6-be9c-73ba0a62aacd` |
| 3 | `GET /v1/conversations/{id}` | 404 | 79 | `qa-a1f0a856-975c-4db4-9d86-e587e41994af` |
| 4 | `GET /v1/accounts/{handle}` | 404 | 33 | `qa-e1590efd-b67c-4122-8b8d-412e43908b33` |
| 5 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-2c8a789f-2307-403c-a7e8-d063d33b9e5f` |
| 6 | `POST /v1/auth/token` | 401 | 14 | `qa-bdc5b265-d82c-49df-9159-367ba3c3ffac` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3919c439-3714-4f92-ba1d-fcfa2d7b06e7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3919c439-3714-4f92-ba1d-fcfa2d7b06e7
Content-Type: application/json

--- request body ---
{"handle":"qa-72d44cb4044b","displayName":"QA 72d44cb4044b","password":"****","region":"eu"}

--- response: 201 in 621 ms ---
Date: Mon, 26 Oct 2026 07:54:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-3919c439-3714-4f92-ba1d-fcfa2d7b06e7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 595
RateLimit-Reset: 10
Location: /v1/accounts/qa-72d44cb4044b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0e979a25-a4f5-4781-91b9-20ae615668db","handle":"qa-72d44cb4044b","displayName":"QA 72d44cb4044b","region":"eu","role":"user","createdAt":"2026-10-26T07:54:44.396563905Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-af058f4c-028c-43b6-be9c-73ba0a62aacd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-af058f4c-028c-43b6-be9c-73ba0a62aacd
Content-Type: application/json

--- request body ---
{"handle":"qa-72d44cb4044b","password":"****"}

--- response: 200 in 48 ms ---
Date: Mon, 26 Oct 2026 07:54:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-af058f4c-028c-43b6-be9c-73ba0a62aacd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 592
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0e979a25-a4f5-4781-91b9-20ae615668db"}
```

## 3. GET /v1/conversations/{id}

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist
correlation: qa-a1f0a856-975c-4db4-9d86-e587e41994af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a1f0a856-975c-4db4-9d86-e587e41994af
Content-Type: application/json

--- response: 404 in 79 ms ---
Date: Mon, 26 Oct 2026 07:54:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a1f0a856-975c-4db4-9d86-e587e41994af
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist","correlationId":"qa-a1f0a856-975c-4db4-9d86-e587e41994af"}
```

## 4. GET /v1/accounts/{handle}

```text
#4 GET http://localhost:7070/v1/accounts/qa-nobody-here
correlation: qa-e1590efd-b67c-4122-8b8d-412e43908b33

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e1590efd-b67c-4122-8b8d-412e43908b33
Content-Type: application/json

--- response: 404 in 33 ms ---
Date: Mon, 26 Oct 2026 07:54:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e1590efd-b67c-4122-8b8d-412e43908b33
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
Content-Length: 247

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No account with handle 'qa-nobody-here'.","instance":"/v1/accounts/qa-nobody-here","correlationId":"qa-e1590efd-b67c-4122-8b8d-412e43908b33"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2c8a789f-2307-403c-a7e8-d063d33b9e5f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2c8a789f-2307-403c-a7e8-d063d33b9e5f
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Mon, 26 Oct 2026 07:54:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2c8a789f-2307-403c-a7e8-d063d33b9e5f
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

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-bdc5b265-d82c-49df-9159-367ba3c3ffac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bdc5b265-d82c-49df-9159-367ba3c3ffac
Content-Type: application/json

--- request body ---
{"handle":"qa-72d44cb4044b","password":"****"}

--- response: 401 in 14 ms ---
Date: Mon, 26 Oct 2026 07:54:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bdc5b265-d82c-49df-9159-367ba3c3ffac
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 589
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bdc5b265-d82c-49df-9159-367ba3c3ffac"}
```
