# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/credits/purchases, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[16]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 35 | `qa-57a21cb0-a5b9-4ba9-8870-7f17e81e8453` |
| 2 | `POST /v1/accounts` | 201 | 23 | `qa-16646bd8-dee9-4c18-a02d-864176f1b640` |
| 3 | `POST /v1/auth/token` | 200 | 39 | `qa-daf5aeee-c30c-47ac-8e6a-1ac943dfc11d` |
| 4 | `POST /v1/conversations` | 201 | 7 | `qa-b0a0943b-b576-4574-935c-1329a9ed8d42` |
| 5 | `POST /v1/credits/purchases` | 415 | 20 | `qa-68ce89ae-7743-4582-ab75-2f2eba5fafb6` |
| 6 | `POST /v1/auth/token` | 200 | 28 | `qa-a23c5c0e-826f-4c8d-93e4-650b1a258bfc` |
| 7 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-20ae7810-7a91-42f3-865b-8fa4e2bcf936` |
| 8 | `POST /v1/auth/token` | 401 | 9 | `qa-e2a93337-d31f-4497-a1c8-0ea6486d4177` |
| 9 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-3d01f92b-47d3-46e5-8573-bb59b732ab63` |
| 10 | `POST /v1/auth/token` | 401 | 4 | `qa-bc28c953-b091-4a14-91bf-98e6637ec1be` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-57a21cb0-a5b9-4ba9-8870-7f17e81e8453

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-57a21cb0-a5b9-4ba9-8870-7f17e81e8453
Content-Type: application/json

--- request body ---
{"handle":"qa-e5d94f07dca6","displayName":"QA e5d94f07dca6","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-57a21cb0-a5b9-4ba9-8870-7f17e81e8453
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 347
RateLimit-Reset: 8
Location: /v1/accounts/qa-e5d94f07dca6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c8ef9bba-da4b-4653-bceb-b7f1b7a10c59","handle":"qa-e5d94f07dca6","displayName":"QA e5d94f07dca6","region":"eu","role":"user","createdAt":"2026-11-04T09:28:03.418291846Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-16646bd8-dee9-4c18-a02d-864176f1b640

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-16646bd8-dee9-4c18-a02d-864176f1b640
Content-Type: application/json

--- request body ---
{"handle":"qa-17b99ba251d0","displayName":"QA 17b99ba251d0","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-16646bd8-dee9-4c18-a02d-864176f1b640
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 342
RateLimit-Reset: 8
Location: /v1/accounts/qa-17b99ba251d0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_23c001d0-3ad2-44cd-92b2-a6eb72b0b64c","handle":"qa-17b99ba251d0","displayName":"QA 17b99ba251d0","region":"eu","role":"user","createdAt":"2026-11-04T09:28:03.452588318Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-daf5aeee-c30c-47ac-8e6a-1ac943dfc11d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-daf5aeee-c30c-47ac-8e6a-1ac943dfc11d
Content-Type: application/json

--- request body ---
{"handle":"qa-e5d94f07dca6","password":"****"}

--- response: 200 in 39 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-daf5aeee-c30c-47ac-8e6a-1ac943dfc11d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 335
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c8ef9bba-da4b-4653-bceb-b7f1b7a10c59"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-b0a0943b-b576-4574-935c-1329a9ed8d42

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b0a0943b-b576-4574-935c-1329a9ed8d42
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-17b99ba251d0","subject":"Error contract","message":"Hi"}

--- response: 201 in 7 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-b0a0943b-b576-4574-935c-1329a9ed8d42
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
Location: /v1/conversations/cnv_c9387d8a-d975-4862-8fbb-5f6bc0c188a8
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_c9387d8a-d975-4862-8fbb-5f6bc0c188a8","subject":"Error contract","status":"open","region":"eu","participants":["qa-e5d94f07dca6","qa-17b99ba251d0"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-04T09:28:03.523614358Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-68ce89ae-7743-4582-ab75-2f2eba5fafb6

--- request headers ---
Accept: application/json
Idempotency-Key: qa-11b32c70b01348c898161027637b6aa3
X-Correlation-Id: qa-68ce89ae-7743-4582-ab75-2f2eba5fafb6
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 20 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-68ce89ae-7743-4582-ab75-2f2eba5fafb6
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
Content-Length: 261

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/credits/purchases","correlationId":"qa-68ce89ae-7743-4582-ab75-2f2eba5fafb6"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-a23c5c0e-826f-4c8d-93e4-650b1a258bfc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a23c5c0e-826f-4c8d-93e4-650b1a258bfc
Content-Type: application/json

--- request body ---
{"handle":"qa-17b99ba251d0","password":"****"}

--- response: 200 in 28 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-a23c5c0e-826f-4c8d-93e4-650b1a258bfc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 325
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_23c001d0-3ad2-44cd-92b2-a6eb72b0b64c"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-20ae7810-7a91-42f3-865b-8fa4e2bcf936

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-20ae7810-7a91-42f3-865b-8fa4e2bcf936
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-20ae7810-7a91-42f3-865b-8fa4e2bcf936
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
correlation: qa-e2a93337-d31f-4497-a1c8-0ea6486d4177

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e2a93337-d31f-4497-a1c8-0ea6486d4177
Content-Type: application/json

--- request body ---
{"handle":"qa-17b99ba251d0","password":"****"}

--- response: 401 in 9 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e2a93337-d31f-4497-a1c8-0ea6486d4177
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 322
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e2a93337-d31f-4497-a1c8-0ea6486d4177"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3d01f92b-47d3-46e5-8573-bb59b732ab63

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d01f92b-47d3-46e5-8573-bb59b732ab63
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3d01f92b-47d3-46e5-8573-bb59b732ab63
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
correlation: qa-bc28c953-b091-4a14-91bf-98e6637ec1be

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bc28c953-b091-4a14-91bf-98e6637ec1be
Content-Type: application/json

--- request body ---
{"handle":"qa-e5d94f07dca6","password":"****"}

--- response: 401 in 4 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bc28c953-b091-4a14-91bf-98e6637ec1be
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 319
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bc28c953-b091-4a14-91bf-98e6637ec1be"}
```
