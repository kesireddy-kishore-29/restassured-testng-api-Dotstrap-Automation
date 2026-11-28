# Transcript: A token stops working when it expires

| | |
|---|---|
| Test | `com.qaautomation.tests.security.AuthorizationTest#expiredTokenIsRefused` |
| Features | FEAT-SEC-03 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 36 | `qa-514ec54e-0334-4613-bcd1-42603524819a` |
| 2 | `POST /v1/auth/token` | 200 | 26 | `qa-ce7c9a79-bb36-4154-8b65-5212a94a8bcb` |
| 3 | `GET /v1/accounts/me` | 200 | 8 | `qa-b35c4d33-f5f5-41fe-ae75-a9f5fe8a4539` |
| 4 | `GET /v1/accounts/me` | 200 | 13 | `qa-f44902ed-992a-468d-a41a-b2d784dd3a45` |
| 5 | `GET /v1/accounts/me` | 200 | 5 | `qa-5e45449f-ccda-45f3-ba61-379063658ff2` |
| 6 | `GET /v1/accounts/me` | 401 | 4 | `qa-7a3284f3-c53e-4795-a3ce-8f0875f94300` |
| 7 | `GET /v1/accounts/me` | 401 | 4 | `qa-f2b63115-fd49-453d-8836-a57cef017dd4` |
| 8 | `POST /v1/auth/token` | 200 | 9 | `qa-5d7b2d0c-91aa-4631-b9da-7a6075f25d23` |
| 9 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-4ef13590-0fe0-499e-b6cd-28cae0be8a78` |
| 10 | `POST /v1/auth/token` | 401 | 3 | `qa-a22e046f-c1e9-4a1b-9ed8-83e9fc9b4f07` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-514ec54e-0334-4613-bcd1-42603524819a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-514ec54e-0334-4613-bcd1-42603524819a
Content-Type: application/json

--- request body ---
{"handle":"qa-bc8019908bfc","displayName":"QA bc8019908bfc","password":"****","region":"eu"}

--- response: 201 in 36 ms ---
Date: Sat, 21 Nov 2026 09:57:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-514ec54e-0334-4613-bcd1-42603524819a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 594
RateLimit-Reset: 10
Location: /v1/accounts/qa-bc8019908bfc
X-Served-Region: eu
Content-Length: 181

{"id":"acc_047f6738-e4cb-4257-b5e8-e6cf09a30fd0","handle":"qa-bc8019908bfc","displayName":"QA bc8019908bfc","region":"eu","role":"user","createdAt":"2026-11-21T09:57:05.005588751Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-ce7c9a79-bb36-4154-8b65-5212a94a8bcb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce7c9a79-bb36-4154-8b65-5212a94a8bcb
Content-Type: application/json

--- request body ---
{"handle":"qa-bc8019908bfc","password":"****","ttlSeconds":1}

--- response: 200 in 26 ms ---
Date: Sat, 21 Nov 2026 09:57:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-ce7c9a79-bb36-4154-8b65-5212a94a8bcb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 10
Content-Length: 151

{"accessToken":"****","tokenType":"Bearer","expiresIn":1,"accountId":"acc_047f6738-e4cb-4257-b5e8-e6cf09a30fd0"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-b35c4d33-f5f5-41fe-ae75-a9f5fe8a4539

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b35c4d33-f5f5-41fe-ae75-a9f5fe8a4539
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 21 Nov 2026 09:57:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-b35c4d33-f5f5-41fe-ae75-a9f5fe8a4539
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
Content-Length: 181

{"id":"acc_047f6738-e4cb-4257-b5e8-e6cf09a30fd0","handle":"qa-bc8019908bfc","displayName":"QA bc8019908bfc","region":"eu","role":"user","createdAt":"2026-11-21T09:57:05.005588751Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-f44902ed-992a-468d-a41a-b2d784dd3a45

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f44902ed-992a-468d-a41a-b2d784dd3a45
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Sat, 21 Nov 2026 09:57:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-f44902ed-992a-468d-a41a-b2d784dd3a45
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
Content-Length: 181

{"id":"acc_047f6738-e4cb-4257-b5e8-e6cf09a30fd0","handle":"qa-bc8019908bfc","displayName":"QA bc8019908bfc","region":"eu","role":"user","createdAt":"2026-11-21T09:57:05.005588751Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-5e45449f-ccda-45f3-ba61-379063658ff2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5e45449f-ccda-45f3-ba61-379063658ff2
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sat, 21 Nov 2026 09:57:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-5e45449f-ccda-45f3-ba61-379063658ff2
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
Content-Length: 181

{"id":"acc_047f6738-e4cb-4257-b5e8-e6cf09a30fd0","handle":"qa-bc8019908bfc","displayName":"QA bc8019908bfc","region":"eu","role":"user","createdAt":"2026-11-21T09:57:05.005588751Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-7a3284f3-c53e-4795-a3ce-8f0875f94300

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7a3284f3-c53e-4795-a3ce-8f0875f94300
Content-Type: application/json

--- response: 401 in 4 ms ---
Date: Sat, 21 Nov 2026 09:57:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7a3284f3-c53e-4795-a3ce-8f0875f94300
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
WWW-Authenticate: Bearer error="invalid_token"
Content-Length: 223

{"type":"https://reference-service.example/problems/token-expired","title":"Token expired","status":401,"detail":"Request a new token.","instance":"/v1/accounts/me","correlationId":"qa-7a3284f3-c53e-4795-a3ce-8f0875f94300"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-f2b63115-fd49-453d-8836-a57cef017dd4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f2b63115-fd49-453d-8836-a57cef017dd4
Content-Type: application/json

--- response: 401 in 4 ms ---
Date: Sat, 21 Nov 2026 09:57:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f2b63115-fd49-453d-8836-a57cef017dd4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 55
RateLimit-Reset: 10
WWW-Authenticate: Bearer error="invalid_token"
Content-Length: 223

{"type":"https://reference-service.example/problems/token-expired","title":"Token expired","status":401,"detail":"Request a new token.","instance":"/v1/accounts/me","correlationId":"qa-f2b63115-fd49-453d-8836-a57cef017dd4"}
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-5d7b2d0c-91aa-4631-b9da-7a6075f25d23

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5d7b2d0c-91aa-4631-b9da-7a6075f25d23
Content-Type: application/json

--- request body ---
{"handle":"qa-bc8019908bfc","password":"****"}

--- response: 200 in 9 ms ---
Date: Sat, 21 Nov 2026 09:57:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-5d7b2d0c-91aa-4631-b9da-7a6075f25d23
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 591
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_047f6738-e4cb-4257-b5e8-e6cf09a30fd0"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4ef13590-0fe0-499e-b6cd-28cae0be8a78

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4ef13590-0fe0-499e-b6cd-28cae0be8a78
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Sat, 21 Nov 2026 09:57:06 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4ef13590-0fe0-499e-b6cd-28cae0be8a78
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
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-a22e046f-c1e9-4a1b-9ed8-83e9fc9b4f07

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a22e046f-c1e9-4a1b-9ed8-83e9fc9b4f07
Content-Type: application/json

--- request body ---
{"handle":"qa-bc8019908bfc","password":"****"}

--- response: 401 in 3 ms ---
Date: Sat, 21 Nov 2026 09:57:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a22e046f-c1e9-4a1b-9ed8-83e9fc9b4f07
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 590
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a22e046f-c1e9-4a1b-9ed8-83e9fc9b4f07"}
```
