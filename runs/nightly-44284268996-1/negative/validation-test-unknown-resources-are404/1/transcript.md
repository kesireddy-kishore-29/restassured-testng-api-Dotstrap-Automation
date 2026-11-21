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
| 1 | `POST /v1/accounts` | 201 | 416 | `qa-0cecbead-a3eb-4dae-94d3-bb4876c6e460` |
| 2 | `POST /v1/auth/token` | 200 | 40 | `qa-71a542cd-3c7f-402f-a270-374200c3da09` |
| 3 | `GET /v1/conversations/{id}` | 404 | 95 | `qa-6a56b594-e2d2-433f-878c-233c719e6181` |
| 4 | `GET /v1/accounts/{handle}` | 404 | 10 | `qa-72c8fbc5-4f7e-404f-8276-ee199215ed03` |
| 5 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-9218393d-9a71-4bc8-8974-2016a80d5ac0` |
| 6 | `POST /v1/auth/token` | 401 | 10 | `qa-9671c51a-ef16-4d79-af64-86724cd056c5` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0cecbead-a3eb-4dae-94d3-bb4876c6e460

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0cecbead-a3eb-4dae-94d3-bb4876c6e460
Content-Type: application/json

--- request body ---
{"handle":"qa-ec93ec76300e","displayName":"QA ec93ec76300e","password":"****","region":"eu"}

--- response: 201 in 416 ms ---
Date: Wed, 18 Nov 2026 10:19:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-0cecbead-a3eb-4dae-94d3-bb4876c6e460
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
Location: /v1/accounts/qa-ec93ec76300e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_59a13c59-6b1d-4fe3-adb9-36113045fc0b","handle":"qa-ec93ec76300e","displayName":"QA ec93ec76300e","region":"eu","role":"user","createdAt":"2026-11-18T10:19:58.731665296Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-71a542cd-3c7f-402f-a270-374200c3da09

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-71a542cd-3c7f-402f-a270-374200c3da09
Content-Type: application/json

--- request body ---
{"handle":"qa-ec93ec76300e","password":"****"}

--- response: 200 in 40 ms ---
Date: Wed, 18 Nov 2026 10:19:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-71a542cd-3c7f-402f-a270-374200c3da09
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 591
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_59a13c59-6b1d-4fe3-adb9-36113045fc0b"}
```

## 3. GET /v1/conversations/{id}

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist
correlation: qa-6a56b594-e2d2-433f-878c-233c719e6181

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6a56b594-e2d2-433f-878c-233c719e6181
Content-Type: application/json

--- response: 404 in 95 ms ---
Date: Wed, 18 Nov 2026 10:19:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6a56b594-e2d2-433f-878c-233c719e6181
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist","correlationId":"qa-6a56b594-e2d2-433f-878c-233c719e6181"}
```

## 4. GET /v1/accounts/{handle}

```text
#4 GET http://localhost:7070/v1/accounts/qa-nobody-here
correlation: qa-72c8fbc5-4f7e-404f-8276-ee199215ed03

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-72c8fbc5-4f7e-404f-8276-ee199215ed03
Content-Type: application/json

--- response: 404 in 10 ms ---
Date: Wed, 18 Nov 2026 10:19:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-72c8fbc5-4f7e-404f-8276-ee199215ed03
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No account with handle 'qa-nobody-here'.","instance":"/v1/accounts/qa-nobody-here","correlationId":"qa-72c8fbc5-4f7e-404f-8276-ee199215ed03"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9218393d-9a71-4bc8-8974-2016a80d5ac0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9218393d-9a71-4bc8-8974-2016a80d5ac0
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Wed, 18 Nov 2026 10:19:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9218393d-9a71-4bc8-8974-2016a80d5ac0
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
correlation: qa-9671c51a-ef16-4d79-af64-86724cd056c5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9671c51a-ef16-4d79-af64-86724cd056c5
Content-Type: application/json

--- request body ---
{"handle":"qa-ec93ec76300e","password":"****"}

--- response: 401 in 10 ms ---
Date: Wed, 18 Nov 2026 10:19:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9671c51a-ef16-4d79-af64-86724cd056c5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 588
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9671c51a-ef16-4d79-af64-86724cd056c5"}
```
