# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[10]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 29 | `qa-26263b9f-dbae-48fb-8082-e4de04ec63b0` |
| 2 | `POST /v1/accounts` | 201 | 45 | `qa-b3c1d480-cd0a-4aea-986e-fa82b79d0cfc` |
| 3 | `POST /v1/auth/token` | 200 | 33 | `qa-b17af775-1e13-450e-b94b-6d3be769b55e` |
| 4 | `POST /v1/conversations` | 201 | 27 | `qa-777e3715-b24f-43ec-b2a1-00878e9b867b` |
| 5 | `POST /v1/conversations` | 415 | 13 | `qa-1da33e68-f7c0-4256-866c-2a364d1eba6a` |
| 6 | `POST /v1/auth/token` | 200 | 63 | `qa-32202ec3-2540-4022-8403-1bb7afd8f842` |
| 7 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-07c7a2f8-a7e7-41e6-87bc-362f9831dd12` |
| 8 | `POST /v1/auth/token` | 401 | 12 | `qa-a79417eb-51be-4a6e-817c-96ac7241ba0f` |
| 9 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-b39d6450-e308-45f6-a2e3-76d366046cd6` |
| 10 | `POST /v1/auth/token` | 401 | 17 | `qa-8046bfa8-8af2-476a-a4da-1c4bf24d3264` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-26263b9f-dbae-48fb-8082-e4de04ec63b0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-26263b9f-dbae-48fb-8082-e4de04ec63b0
Content-Type: application/json

--- request body ---
{"handle":"qa-9f8ec024bfaa","displayName":"QA 9f8ec024bfaa","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-26263b9f-dbae-48fb-8082-e4de04ec63b0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 409
RateLimit-Reset: 7
Location: /v1/accounts/qa-9f8ec024bfaa
X-Served-Region: eu
Content-Length: 181

{"id":"acc_64db47fe-e93f-4d47-bac0-9169471c0d75","handle":"qa-9f8ec024bfaa","displayName":"QA 9f8ec024bfaa","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.880115657Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-b3c1d480-cd0a-4aea-986e-fa82b79d0cfc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b3c1d480-cd0a-4aea-986e-fa82b79d0cfc
Content-Type: application/json

--- request body ---
{"handle":"qa-e29c1b6267b3","displayName":"QA e29c1b6267b3","password":"****","region":"eu"}

--- response: 201 in 45 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-b3c1d480-cd0a-4aea-986e-fa82b79d0cfc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 399
RateLimit-Reset: 7
Location: /v1/accounts/qa-e29c1b6267b3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_40e124f2-f96b-44a2-8d2c-86109e5577d8","handle":"qa-e29c1b6267b3","displayName":"QA e29c1b6267b3","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.938187609Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-b17af775-1e13-450e-b94b-6d3be769b55e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b17af775-1e13-450e-b94b-6d3be769b55e
Content-Type: application/json

--- request body ---
{"handle":"qa-9f8ec024bfaa","password":"****"}

--- response: 200 in 33 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-b17af775-1e13-450e-b94b-6d3be769b55e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 397
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_64db47fe-e93f-4d47-bac0-9169471c0d75"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-777e3715-b24f-43ec-b2a1-00878e9b867b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-777e3715-b24f-43ec-b2a1-00878e9b867b
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-e29c1b6267b3","subject":"Error contract","message":"Hi"}

--- response: 201 in 27 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-777e3715-b24f-43ec-b2a1-00878e9b867b
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
Location: /v1/conversations/cnv_4fd49a01-1f1b-4deb-8dbe-a528962d653b
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_4fd49a01-1f1b-4deb-8dbe-a528962d653b","subject":"Error contract","status":"open","region":"eu","participants":["qa-9f8ec024bfaa","qa-e29c1b6267b3"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-26T11:02:46.012685339Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-1da33e68-f7c0-4256-866c-2a364d1eba6a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1da33e68-f7c0-4256-866c-2a364d1eba6a
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 13 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1da33e68-f7c0-4256-866c-2a364d1eba6a
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
Content-Length: 257

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/conversations","correlationId":"qa-1da33e68-f7c0-4256-866c-2a364d1eba6a"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-32202ec3-2540-4022-8403-1bb7afd8f842

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-32202ec3-2540-4022-8403-1bb7afd8f842
Content-Type: application/json

--- request body ---
{"handle":"qa-e29c1b6267b3","password":"****"}

--- response: 200 in 63 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-32202ec3-2540-4022-8403-1bb7afd8f842
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 382
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_40e124f2-f96b-44a2-8d2c-86109e5577d8"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-07c7a2f8-a7e7-41e6-87bc-362f9831dd12

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-07c7a2f8-a7e7-41e6-87bc-362f9831dd12
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: text/plain
X-Correlation-Id: qa-07c7a2f8-a7e7-41e6-87bc-362f9831dd12
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
correlation: qa-a79417eb-51be-4a6e-817c-96ac7241ba0f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a79417eb-51be-4a6e-817c-96ac7241ba0f
Content-Type: application/json

--- request body ---
{"handle":"qa-e29c1b6267b3","password":"****"}

--- response: 401 in 12 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a79417eb-51be-4a6e-817c-96ac7241ba0f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 370
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a79417eb-51be-4a6e-817c-96ac7241ba0f"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b39d6450-e308-45f6-a2e3-76d366046cd6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b39d6450-e308-45f6-a2e3-76d366046cd6
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b39d6450-e308-45f6-a2e3-76d366046cd6
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

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-8046bfa8-8af2-476a-a4da-1c4bf24d3264

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8046bfa8-8af2-476a-a4da-1c4bf24d3264
Content-Type: application/json

--- request body ---
{"handle":"qa-9f8ec024bfaa","password":"****"}

--- response: 401 in 17 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8046bfa8-8af2-476a-a4da-1c4bf24d3264
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 363
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8046bfa8-8af2-476a-a4da-1c4bf24d3264"}
```
