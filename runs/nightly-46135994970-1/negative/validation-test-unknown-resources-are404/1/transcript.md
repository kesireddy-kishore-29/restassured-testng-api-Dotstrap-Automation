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
| 1 | `POST /v1/accounts` | 201 | 23 | `qa-88d35ffd-b33d-4e3c-ae6e-8f309d134432` |
| 2 | `POST /v1/auth/token` | 200 | 30 | `qa-c2b7fb94-b79f-448a-98e1-4d3ccef974ce` |
| 3 | `GET /v1/conversations/{id}` | 404 | 14 | `qa-898fa1a6-73ce-487a-9a4b-01756acc187b` |
| 4 | `GET /v1/accounts/{handle}` | 404 | 22 | `qa-2d1d2a8c-1bb1-472e-adcb-4b513489e56b` |
| 5 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-ede3c266-d9dc-4747-a9e3-af5c660bd1d3` |
| 6 | `POST /v1/auth/token` | 401 | 13 | `qa-2c6b4e2a-351d-41b5-962a-3a289caba2ce` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-88d35ffd-b33d-4e3c-ae6e-8f309d134432

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-88d35ffd-b33d-4e3c-ae6e-8f309d134432
Content-Type: application/json

--- request body ---
{"handle":"qa-5bf0d60b475e","displayName":"QA 5bf0d60b475e","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Sat, 28 Nov 2026 10:37:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-88d35ffd-b33d-4e3c-ae6e-8f309d134432
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 584
RateLimit-Reset: 9
Location: /v1/accounts/qa-5bf0d60b475e
X-Served-Region: eu
Content-Length: 178

{"id":"acc_c0442f39-5f12-482b-acaf-f54b36470c8e","handle":"qa-5bf0d60b475e","displayName":"QA 5bf0d60b475e","region":"eu","role":"user","createdAt":"2026-11-28T10:37:14.895480Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-c2b7fb94-b79f-448a-98e1-4d3ccef974ce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c2b7fb94-b79f-448a-98e1-4d3ccef974ce
Content-Type: application/json

--- request body ---
{"handle":"qa-5bf0d60b475e","password":"****"}

--- response: 200 in 30 ms ---
Date: Sat, 28 Nov 2026 10:37:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-c2b7fb94-b79f-448a-98e1-4d3ccef974ce
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c0442f39-5f12-482b-acaf-f54b36470c8e"}
```

## 3. GET /v1/conversations/{id}

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist
correlation: qa-898fa1a6-73ce-487a-9a4b-01756acc187b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-898fa1a6-73ce-487a-9a4b-01756acc187b
Content-Type: application/json

--- response: 404 in 14 ms ---
Date: Sat, 28 Nov 2026 10:37:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-898fa1a6-73ce-487a-9a4b-01756acc187b
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist","correlationId":"qa-898fa1a6-73ce-487a-9a4b-01756acc187b"}
```

## 4. GET /v1/accounts/{handle}

```text
#4 GET http://localhost:7070/v1/accounts/qa-nobody-here
correlation: qa-2d1d2a8c-1bb1-472e-adcb-4b513489e56b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2d1d2a8c-1bb1-472e-adcb-4b513489e56b
Content-Type: application/json

--- response: 404 in 22 ms ---
Date: Sat, 28 Nov 2026 10:37:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2d1d2a8c-1bb1-472e-adcb-4b513489e56b
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No account with handle 'qa-nobody-here'.","instance":"/v1/accounts/qa-nobody-here","correlationId":"qa-2d1d2a8c-1bb1-472e-adcb-4b513489e56b"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ede3c266-d9dc-4747-a9e3-af5c660bd1d3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ede3c266-d9dc-4747-a9e3-af5c660bd1d3
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Sat, 28 Nov 2026 10:37:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ede3c266-d9dc-4747-a9e3-af5c660bd1d3
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
correlation: qa-2c6b4e2a-351d-41b5-962a-3a289caba2ce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2c6b4e2a-351d-41b5-962a-3a289caba2ce
Content-Type: application/json

--- request body ---
{"handle":"qa-5bf0d60b475e","password":"****"}

--- response: 401 in 13 ms ---
Date: Sat, 28 Nov 2026 10:37:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2c6b4e2a-351d-41b5-962a-3a289caba2ce
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 569
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2c6b4e2a-351d-41b5-962a-3a289caba2ce"}
```
