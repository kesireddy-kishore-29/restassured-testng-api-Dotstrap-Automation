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
| 1 | `POST /v1/accounts` | 201 | 9 | `qa-fcf50872-b76e-433f-aad2-1d8469d8f438` |
| 2 | `POST /v1/auth/token` | 200 | 6 | `qa-2d8e60f3-b25d-465f-ab84-cca849d9d36f` |
| 3 | `POST /v1/conversations/{id}/close` | 404 | 3 | `qa-551a4a34-4fd4-4c2c-ac39-64a84a16f7e1` |
| 4 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-3c0711a6-a4d8-404c-bfc2-053032c8a907` |
| 5 | `POST /v1/auth/token` | 401 | 6 | `qa-20f7f48a-bd30-46cb-9f8f-1d82ce662e86` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-fcf50872-b76e-433f-aad2-1d8469d8f438

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fcf50872-b76e-433f-aad2-1d8469d8f438
Content-Type: application/json

--- request body ---
{"handle":"qa-cbdc411454ec","displayName":"QA cbdc411454ec","password":"****","region":"eu"}

--- response: 201 in 9 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-fcf50872-b76e-433f-aad2-1d8469d8f438
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 276
RateLimit-Reset: 7
Location: /v1/accounts/qa-cbdc411454ec
X-Served-Region: eu
Content-Length: 181

{"id":"acc_294b4faa-710a-42c1-9f6c-c48ec2eba4f6","handle":"qa-cbdc411454ec","displayName":"QA cbdc411454ec","region":"eu","role":"user","createdAt":"2026-11-07T08:54:59.923005570Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-2d8e60f3-b25d-465f-ab84-cca849d9d36f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2d8e60f3-b25d-465f-ab84-cca849d9d36f
Content-Type: application/json

--- request body ---
{"handle":"qa-cbdc411454ec","password":"****"}

--- response: 200 in 6 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-2d8e60f3-b25d-465f-ab84-cca849d9d36f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 275
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_294b4faa-710a-42c1-9f6c-c48ec2eba4f6"}
```

## 3. POST /v1/conversations/{id}/close

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/close
correlation: qa-551a4a34-4fd4-4c2c-ac39-64a84a16f7e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-551a4a34-4fd4-4c2c-ac39-64a84a16f7e1
Content-Type: application/json

--- response: 404 in 3 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-551a4a34-4fd4-4c2c-ac39-64a84a16f7e1
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/close","correlationId":"qa-551a4a34-4fd4-4c2c-ac39-64a84a16f7e1"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3c0711a6-a4d8-404c-bfc2-053032c8a907

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3c0711a6-a4d8-404c-bfc2-053032c8a907
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3c0711a6-a4d8-404c-bfc2-053032c8a907
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
correlation: qa-20f7f48a-bd30-46cb-9f8f-1d82ce662e86

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-20f7f48a-bd30-46cb-9f8f-1d82ce662e86
Content-Type: application/json

--- request body ---
{"handle":"qa-cbdc411454ec","password":"****"}

--- response: 401 in 6 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-20f7f48a-bd30-46cb-9f8f-1d82ce662e86
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 271
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-20f7f48a-bd30-46cb-9f8f-1d82ce662e86"}
```
