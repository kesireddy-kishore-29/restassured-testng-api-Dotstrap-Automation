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
| 1 | `POST /v1/accounts` | 201 | 48 | `qa-90a3a760-4228-4e48-b414-019e20c55767` |
| 2 | `POST /v1/accounts` | 201 | 25 | `qa-b69936da-a896-4007-b2ab-1143b358e4f1` |
| 3 | `POST /v1/auth/token` | 200 | 24 | `qa-78efcff1-2262-454e-806e-4ed22d47e1ae` |
| 4 | `POST /v1/conversations` | 201 | 12 | `qa-adfe4c0b-f1c5-49b9-b0d0-3c02a0c89409` |
| 5 | `POST /v1/credits/purchases` | 415 | 11 | `qa-82b94448-ec4d-4a76-92af-844ef5b218f7` |
| 6 | `POST /v1/auth/token` | 200 | 25 | `qa-3d5ef9fd-f55a-4ef3-9425-0908c92a4a77` |
| 7 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-59754d64-0186-44f9-b5a0-4817fe28f148` |
| 8 | `POST /v1/auth/token` | 401 | 8 | `qa-3db8bd5c-0268-4d6b-a650-9ea3d8656f2a` |
| 9 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-5018bc02-ab0e-485f-8e80-813f5fd17c03` |
| 10 | `POST /v1/auth/token` | 401 | 12 | `qa-47290adf-8e21-4ab6-80c0-39908b8be7c3` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-90a3a760-4228-4e48-b414-019e20c55767

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-90a3a760-4228-4e48-b414-019e20c55767
Content-Type: application/json

--- request body ---
{"handle":"qa-b71e0598fecb","displayName":"QA b71e0598fecb","password":"****","region":"eu"}

--- response: 201 in 48 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-90a3a760-4228-4e48-b414-019e20c55767
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 341
RateLimit-Reset: 6
Location: /v1/accounts/qa-b71e0598fecb
X-Served-Region: eu
Content-Length: 181

{"id":"acc_45ef0fd8-4fe5-4ce9-a502-0df69b1490bf","handle":"qa-b71e0598fecb","displayName":"QA b71e0598fecb","region":"eu","role":"user","createdAt":"2026-10-31T08:31:36.686241027Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-b69936da-a896-4007-b2ab-1143b358e4f1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b69936da-a896-4007-b2ab-1143b358e4f1
Content-Type: application/json

--- request body ---
{"handle":"qa-9d0fea97f4f4","displayName":"QA 9d0fea97f4f4","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-b69936da-a896-4007-b2ab-1143b358e4f1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 336
RateLimit-Reset: 6
Location: /v1/accounts/qa-9d0fea97f4f4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_02117f2e-6ebf-4cba-8acc-0c41c16f86e2","handle":"qa-9d0fea97f4f4","displayName":"QA 9d0fea97f4f4","region":"eu","role":"user","createdAt":"2026-10-31T08:31:36.741496704Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-78efcff1-2262-454e-806e-4ed22d47e1ae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-78efcff1-2262-454e-806e-4ed22d47e1ae
Content-Type: application/json

--- request body ---
{"handle":"qa-b71e0598fecb","password":"****"}

--- response: 200 in 24 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-78efcff1-2262-454e-806e-4ed22d47e1ae
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 332
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_45ef0fd8-4fe5-4ce9-a502-0df69b1490bf"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-adfe4c0b-f1c5-49b9-b0d0-3c02a0c89409

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-adfe4c0b-f1c5-49b9-b0d0-3c02a0c89409
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-9d0fea97f4f4","subject":"Error contract","message":"Hi"}

--- response: 201 in 12 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-adfe4c0b-f1c5-49b9-b0d0-3c02a0c89409
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
Location: /v1/conversations/cnv_d6c75a8e-1c87-463d-8719-00d302855235
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_d6c75a8e-1c87-463d-8719-00d302855235","subject":"Error contract","status":"open","region":"eu","participants":["qa-b71e0598fecb","qa-9d0fea97f4f4"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-31T08:31:36.805263061Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-82b94448-ec4d-4a76-92af-844ef5b218f7

--- request headers ---
Accept: application/json
Idempotency-Key: qa-bf82e8a9b900445f992215e580e866f7
X-Correlation-Id: qa-82b94448-ec4d-4a76-92af-844ef5b218f7
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 11 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-82b94448-ec4d-4a76-92af-844ef5b218f7
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

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/credits/purchases","correlationId":"qa-82b94448-ec4d-4a76-92af-844ef5b218f7"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-3d5ef9fd-f55a-4ef3-9425-0908c92a4a77

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d5ef9fd-f55a-4ef3-9425-0908c92a4a77
Content-Type: application/json

--- request body ---
{"handle":"qa-9d0fea97f4f4","password":"****"}

--- response: 200 in 25 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-3d5ef9fd-f55a-4ef3-9425-0908c92a4a77
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 321
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_02117f2e-6ebf-4cba-8acc-0c41c16f86e2"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-59754d64-0186-44f9-b5a0-4817fe28f148

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-59754d64-0186-44f9-b5a0-4817fe28f148
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-59754d64-0186-44f9-b5a0-4817fe28f148
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
correlation: qa-3db8bd5c-0268-4d6b-a650-9ea3d8656f2a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3db8bd5c-0268-4d6b-a650-9ea3d8656f2a
Content-Type: application/json

--- request body ---
{"handle":"qa-9d0fea97f4f4","password":"****"}

--- response: 401 in 8 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3db8bd5c-0268-4d6b-a650-9ea3d8656f2a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 318
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3db8bd5c-0268-4d6b-a650-9ea3d8656f2a"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5018bc02-ab0e-485f-8e80-813f5fd17c03

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5018bc02-ab0e-485f-8e80-813f5fd17c03
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5018bc02-ab0e-485f-8e80-813f5fd17c03
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
correlation: qa-47290adf-8e21-4ab6-80c0-39908b8be7c3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-47290adf-8e21-4ab6-80c0-39908b8be7c3
Content-Type: application/json

--- request body ---
{"handle":"qa-b71e0598fecb","password":"****"}

--- response: 401 in 12 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-47290adf-8e21-4ab6-80c0-39908b8be7c3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 314
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-47290adf-8e21-4ab6-80c0-39908b8be7c3"}
```
