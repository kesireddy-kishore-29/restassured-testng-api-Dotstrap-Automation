# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/accounts, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[4]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 36 | `qa-5ac717ed-5879-4d23-acc3-95964f8d5430` |
| 2 | `POST /v1/accounts` | 201 | 26 | `qa-0f42f326-de54-4ded-86ad-757d49301520` |
| 3 | `POST /v1/auth/token` | 200 | 46 | `qa-3fd9f8d5-c80e-4b5c-847f-c1a59042e79e` |
| 4 | `POST /v1/conversations` | 201 | 32 | `qa-d934dceb-e431-491e-a075-0406a105090a` |
| 5 | `POST /v1/accounts` | 415 | 22 | `qa-8c34daa9-4a66-4fac-9a9d-185cd2368630` |
| 6 | `POST /v1/auth/token` | 200 | 23 | `qa-0bc846d9-f3b9-423f-8cfd-2cb9de04bf6d` |
| 7 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-ef2260f6-265f-4020-94d6-227bebec0233` |
| 8 | `POST /v1/auth/token` | 401 | 26 | `qa-5f5fd593-0504-4789-9716-0709e982525a` |
| 9 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-70f6338d-f0c9-430d-859c-078b00708d55` |
| 10 | `POST /v1/auth/token` | 401 | 18 | `qa-3fd1df4e-ee44-4ae7-9e4d-c0b82dcadc86` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5ac717ed-5879-4d23-acc3-95964f8d5430

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5ac717ed-5879-4d23-acc3-95964f8d5430
Content-Type: application/json

--- request body ---
{"handle":"qa-06c0073136a3","displayName":"QA 06c0073136a3","password":"****","region":"eu"}

--- response: 201 in 36 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-5ac717ed-5879-4d23-acc3-95964f8d5430
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 485
RateLimit-Reset: 8
Location: /v1/accounts/qa-06c0073136a3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f8739590-4859-4537-84f2-29c992187cd7","handle":"qa-06c0073136a3","displayName":"QA 06c0073136a3","region":"eu","role":"user","createdAt":"2026-11-13T09:42:06.980608634Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-0f42f326-de54-4ded-86ad-757d49301520

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f42f326-de54-4ded-86ad-757d49301520
Content-Type: application/json

--- request body ---
{"handle":"qa-a32b6a024a47","displayName":"QA a32b6a024a47","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-0f42f326-de54-4ded-86ad-757d49301520
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 474
RateLimit-Reset: 8
Location: /v1/accounts/qa-a32b6a024a47
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d686ceac-a82b-4157-916e-3eb49132931f","handle":"qa-a32b6a024a47","displayName":"QA a32b6a024a47","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.026895198Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-3fd9f8d5-c80e-4b5c-847f-c1a59042e79e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3fd9f8d5-c80e-4b5c-847f-c1a59042e79e
Content-Type: application/json

--- request body ---
{"handle":"qa-06c0073136a3","password":"****"}

--- response: 200 in 46 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-3fd9f8d5-c80e-4b5c-847f-c1a59042e79e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 464
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f8739590-4859-4537-84f2-29c992187cd7"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-d934dceb-e431-491e-a075-0406a105090a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d934dceb-e431-491e-a075-0406a105090a
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-a32b6a024a47","subject":"Error contract","message":"Hi"}

--- response: 201 in 32 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-d934dceb-e431-491e-a075-0406a105090a
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
Location: /v1/conversations/cnv_cd51e47e-9852-4348-b124-a279dedddc55
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_cd51e47e-9852-4348-b124-a279dedddc55","subject":"Error contract","status":"open","region":"eu","participants":["qa-06c0073136a3","qa-a32b6a024a47"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-13T09:42:07.141363614Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-8c34daa9-4a66-4fac-9a9d-185cd2368630

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c34daa9-4a66-4fac-9a9d-185cd2368630
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 22 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8c34daa9-4a66-4fac-9a9d-185cd2368630
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 447
RateLimit-Reset: 8
Content-Length: 252

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/accounts","correlationId":"qa-8c34daa9-4a66-4fac-9a9d-185cd2368630"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-0bc846d9-f3b9-423f-8cfd-2cb9de04bf6d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0bc846d9-f3b9-423f-8cfd-2cb9de04bf6d
Content-Type: application/json

--- request body ---
{"handle":"qa-a32b6a024a47","password":"****"}

--- response: 200 in 23 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-0bc846d9-f3b9-423f-8cfd-2cb9de04bf6d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 440
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d686ceac-a82b-4157-916e-3eb49132931f"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ef2260f6-265f-4020-94d6-227bebec0233

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef2260f6-265f-4020-94d6-227bebec0233
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ef2260f6-265f-4020-94d6-227bebec0233
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

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-5f5fd593-0504-4789-9716-0709e982525a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5f5fd593-0504-4789-9716-0709e982525a
Content-Type: application/json

--- request body ---
{"handle":"qa-a32b6a024a47","password":"****"}

--- response: 401 in 26 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5f5fd593-0504-4789-9716-0709e982525a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 435
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5f5fd593-0504-4789-9716-0709e982525a"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-70f6338d-f0c9-430d-859c-078b00708d55

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-70f6338d-f0c9-430d-859c-078b00708d55
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: text/plain
X-Correlation-Id: qa-70f6338d-f0c9-430d-859c-078b00708d55
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

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-3fd1df4e-ee44-4ae7-9e4d-c0b82dcadc86

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3fd1df4e-ee44-4ae7-9e4d-c0b82dcadc86
Content-Type: application/json

--- request body ---
{"handle":"qa-06c0073136a3","password":"****"}

--- response: 401 in 18 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3fd1df4e-ee44-4ae7-9e4d-c0b82dcadc86
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 430
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3fd1df4e-ee44-4ae7-9e4d-c0b82dcadc86"}
```
