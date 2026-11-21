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
| 1 | `POST /v1/accounts` | 201 | 21 | `qa-262a4ef9-46e8-4dcd-9d5f-11f9f70cae63` |
| 2 | `POST /v1/auth/token` | 200 | 12 | `qa-5be45a30-ab95-4c81-838a-f65ec92795ee` |
| 3 | `GET /v1/conversations/{id}` | 404 | 10 | `qa-bb100df7-f3cf-46b7-b61b-d4b934cf6958` |
| 4 | `GET /v1/accounts/{handle}` | 404 | 14 | `qa-6677fef1-5fe2-4004-8828-a311177f3132` |
| 5 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-d30524b8-45ca-4ab3-8cb5-d4bc388c70a6` |
| 6 | `POST /v1/auth/token` | 401 | 11 | `qa-76e26361-bb8c-4f63-8b3c-b26a1209fd8a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-262a4ef9-46e8-4dcd-9d5f-11f9f70cae63

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-262a4ef9-46e8-4dcd-9d5f-11f9f70cae63
Content-Type: application/json

--- request body ---
{"handle":"qa-279e8e992be4","displayName":"QA 279e8e992be4","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Sat, 21 Nov 2026 09:56:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-262a4ef9-46e8-4dcd-9d5f-11f9f70cae63
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 582
RateLimit-Reset: 9
Location: /v1/accounts/qa-279e8e992be4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c2dfaecc-4493-4a95-ba3d-dab54b467286","handle":"qa-279e8e992be4","displayName":"QA 279e8e992be4","region":"eu","role":"user","createdAt":"2026-11-21T09:56:59.859182585Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-5be45a30-ab95-4c81-838a-f65ec92795ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5be45a30-ab95-4c81-838a-f65ec92795ee
Content-Type: application/json

--- request body ---
{"handle":"qa-279e8e992be4","password":"****"}

--- response: 200 in 12 ms ---
Date: Sat, 21 Nov 2026 09:56:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-5be45a30-ab95-4c81-838a-f65ec92795ee
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c2dfaecc-4493-4a95-ba3d-dab54b467286"}
```

## 3. GET /v1/conversations/{id}

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist
correlation: qa-bb100df7-f3cf-46b7-b61b-d4b934cf6958

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb100df7-f3cf-46b7-b61b-d4b934cf6958
Content-Type: application/json

--- response: 404 in 10 ms ---
Date: Sat, 21 Nov 2026 09:56:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bb100df7-f3cf-46b7-b61b-d4b934cf6958
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist","correlationId":"qa-bb100df7-f3cf-46b7-b61b-d4b934cf6958"}
```

## 4. GET /v1/accounts/{handle}

```text
#4 GET http://localhost:7070/v1/accounts/qa-nobody-here
correlation: qa-6677fef1-5fe2-4004-8828-a311177f3132

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6677fef1-5fe2-4004-8828-a311177f3132
Content-Type: application/json

--- response: 404 in 14 ms ---
Date: Sat, 21 Nov 2026 09:56:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6677fef1-5fe2-4004-8828-a311177f3132
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No account with handle 'qa-nobody-here'.","instance":"/v1/accounts/qa-nobody-here","correlationId":"qa-6677fef1-5fe2-4004-8828-a311177f3132"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d30524b8-45ca-4ab3-8cb5-d4bc388c70a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d30524b8-45ca-4ab3-8cb5-d4bc388c70a6
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Sat, 21 Nov 2026 09:57:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d30524b8-45ca-4ab3-8cb5-d4bc388c70a6
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
correlation: qa-76e26361-bb8c-4f63-8b3c-b26a1209fd8a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-76e26361-bb8c-4f63-8b3c-b26a1209fd8a
Content-Type: application/json

--- request body ---
{"handle":"qa-279e8e992be4","password":"****"}

--- response: 401 in 11 ms ---
Date: Sat, 21 Nov 2026 09:57:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-76e26361-bb8c-4f63-8b3c-b26a1209fd8a
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-76e26361-bb8c-4f63-8b3c-b26a1209fd8a"}
```
