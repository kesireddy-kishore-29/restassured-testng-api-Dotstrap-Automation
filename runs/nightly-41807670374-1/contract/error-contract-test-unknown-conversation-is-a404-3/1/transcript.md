# Transcript: Every conversation operation answers an unknown id with a 404 problem [POST /v1/conversations/{id}/read]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#unknownConversationIsA404[3]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 35 | `qa-937f0ab0-06e2-4d6d-816b-e6c73458b8bd` |
| 2 | `POST /v1/auth/token` | 200 | 6 | `qa-7b16c715-5c08-4115-ab63-1681b2526e66` |
| 3 | `POST /v1/conversations/{id}/read` | 404 | 15 | `qa-5bcbc877-3367-4169-8fac-432eab5b1b48` |
| 4 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-518cbef1-a58a-475e-880a-1a74deb10662` |
| 5 | `POST /v1/auth/token` | 401 | 12 | `qa-a6deb667-6ba2-4415-a864-68517ebeb515` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-937f0ab0-06e2-4d6d-816b-e6c73458b8bd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-937f0ab0-06e2-4d6d-816b-e6c73458b8bd
Content-Type: application/json

--- request body ---
{"handle":"qa-0b98581471db","displayName":"QA 0b98581471db","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-937f0ab0-06e2-4d6d-816b-e6c73458b8bd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 305
RateLimit-Reset: 8
Location: /v1/accounts/qa-0b98581471db
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ee38e13c-853f-4397-9a1e-ca0a0e348631","handle":"qa-0b98581471db","displayName":"QA 0b98581471db","region":"eu","role":"user","createdAt":"2026-11-04T09:28:03.768704611Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-7b16c715-5c08-4115-ab63-1681b2526e66

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7b16c715-5c08-4115-ab63-1681b2526e66
Content-Type: application/json

--- request body ---
{"handle":"qa-0b98581471db","password":"****"}

--- response: 200 in 6 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-7b16c715-5c08-4115-ab63-1681b2526e66
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 302
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ee38e13c-853f-4397-9a1e-ca0a0e348631"}
```

## 3. POST /v1/conversations/{id}/read

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/read
correlation: qa-5bcbc877-3367-4169-8fac-432eab5b1b48

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5bcbc877-3367-4169-8fac-432eab5b1b48
Content-Type: application/json

--- response: 404 in 15 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5bcbc877-3367-4169-8fac-432eab5b1b48
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
Content-Length: 258

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/read","correlationId":"qa-5bcbc877-3367-4169-8fac-432eab5b1b48"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-518cbef1-a58a-475e-880a-1a74deb10662

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-518cbef1-a58a-475e-880a-1a74deb10662
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-518cbef1-a58a-475e-880a-1a74deb10662
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
correlation: qa-a6deb667-6ba2-4415-a864-68517ebeb515

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a6deb667-6ba2-4415-a864-68517ebeb515
Content-Type: application/json

--- request body ---
{"handle":"qa-0b98581471db","password":"****"}

--- response: 401 in 12 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a6deb667-6ba2-4415-a864-68517ebeb515
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 293
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a6deb667-6ba2-4415-a864-68517ebeb515"}
```
