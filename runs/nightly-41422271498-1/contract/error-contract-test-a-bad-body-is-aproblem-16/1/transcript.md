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
| 1 | `POST /v1/accounts` | 201 | 25 | `qa-90effccd-a06b-49c7-93be-87dc6c14c109` |
| 2 | `POST /v1/accounts` | 201 | 34 | `qa-0a3d0ce7-1bd5-422a-82f2-1f140db3b0ef` |
| 3 | `POST /v1/auth/token` | 200 | 29 | `qa-4e39ff44-a42f-42f1-9c6a-7e971e004969` |
| 4 | `POST /v1/conversations` | 201 | 9 | `qa-32895a34-c327-4338-ad4b-1ce72539b8a6` |
| 5 | `POST /v1/credits/purchases` | 415 | 5 | `qa-5b73e021-554a-48e7-82a7-a3bbbca52f22` |
| 6 | `POST /v1/auth/token` | 200 | 25 | `qa-22c41aba-baa1-40b2-9ef0-6c2780d3694a` |
| 7 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-18986785-88f0-4e74-b142-cd0b6bd36986` |
| 8 | `POST /v1/auth/token` | 401 | 9 | `qa-296c0fec-e670-47dd-8c00-410c3c510ddf` |
| 9 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-92277f0e-9963-4362-8f0c-87dbc32c10a6` |
| 10 | `POST /v1/auth/token` | 401 | 8 | `qa-3be2cdf3-3bbe-436f-9fe6-e2b0d3b05e69` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-90effccd-a06b-49c7-93be-87dc6c14c109

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-90effccd-a06b-49c7-93be-87dc6c14c109
Content-Type: application/json

--- request body ---
{"handle":"qa-2c0db0157b6e","displayName":"QA 2c0db0157b6e","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-90effccd-a06b-49c7-93be-87dc6c14c109
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 351
RateLimit-Reset: 8
Location: /v1/accounts/qa-2c0db0157b6e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1e47cc20-a7c2-4a5f-b4de-4459c67836a1","handle":"qa-2c0db0157b6e","displayName":"QA 2c0db0157b6e","region":"eu","role":"user","createdAt":"2026-11-02T09:38:37.488034731Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-0a3d0ce7-1bd5-422a-82f2-1f140db3b0ef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0a3d0ce7-1bd5-422a-82f2-1f140db3b0ef
Content-Type: application/json

--- request body ---
{"handle":"qa-1b76958a1f96","displayName":"QA 1b76958a1f96","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-0a3d0ce7-1bd5-422a-82f2-1f140db3b0ef
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 343
RateLimit-Reset: 8
Location: /v1/accounts/qa-1b76958a1f96
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d36f4b7e-c975-4e41-b99f-4244085d3c51","handle":"qa-1b76958a1f96","displayName":"QA 1b76958a1f96","region":"eu","role":"user","createdAt":"2026-11-02T09:38:37.540049274Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-4e39ff44-a42f-42f1-9c6a-7e971e004969

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4e39ff44-a42f-42f1-9c6a-7e971e004969
Content-Type: application/json

--- request body ---
{"handle":"qa-2c0db0157b6e","password":"****"}

--- response: 200 in 29 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-4e39ff44-a42f-42f1-9c6a-7e971e004969
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 337
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1e47cc20-a7c2-4a5f-b4de-4459c67836a1"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-32895a34-c327-4338-ad4b-1ce72539b8a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-32895a34-c327-4338-ad4b-1ce72539b8a6
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-1b76958a1f96","subject":"Error contract","message":"Hi"}

--- response: 201 in 9 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-32895a34-c327-4338-ad4b-1ce72539b8a6
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
Location: /v1/conversations/cnv_8c6f6052-3ad9-474e-8e64-2f2557976192
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_8c6f6052-3ad9-474e-8e64-2f2557976192","subject":"Error contract","status":"open","region":"eu","participants":["qa-2c0db0157b6e","qa-1b76958a1f96"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-02T09:38:37.596458309Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-5b73e021-554a-48e7-82a7-a3bbbca52f22

--- request headers ---
Accept: application/json
Idempotency-Key: qa-47189d532b084cc09c5110c2c983bfe0
X-Correlation-Id: qa-5b73e021-554a-48e7-82a7-a3bbbca52f22
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 5 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5b73e021-554a-48e7-82a7-a3bbbca52f22
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

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/credits/purchases","correlationId":"qa-5b73e021-554a-48e7-82a7-a3bbbca52f22"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-22c41aba-baa1-40b2-9ef0-6c2780d3694a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-22c41aba-baa1-40b2-9ef0-6c2780d3694a
Content-Type: application/json

--- request body ---
{"handle":"qa-1b76958a1f96","password":"****"}

--- response: 200 in 25 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-22c41aba-baa1-40b2-9ef0-6c2780d3694a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 328
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d36f4b7e-c975-4e41-b99f-4244085d3c51"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-18986785-88f0-4e74-b142-cd0b6bd36986

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-18986785-88f0-4e74-b142-cd0b6bd36986
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-18986785-88f0-4e74-b142-cd0b6bd36986
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
correlation: qa-296c0fec-e670-47dd-8c00-410c3c510ddf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-296c0fec-e670-47dd-8c00-410c3c510ddf
Content-Type: application/json

--- request body ---
{"handle":"qa-1b76958a1f96","password":"****"}

--- response: 401 in 9 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-296c0fec-e670-47dd-8c00-410c3c510ddf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 324
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-296c0fec-e670-47dd-8c00-410c3c510ddf"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-92277f0e-9963-4362-8f0c-87dbc32c10a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-92277f0e-9963-4362-8f0c-87dbc32c10a6
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-92277f0e-9963-4362-8f0c-87dbc32c10a6
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
correlation: qa-3be2cdf3-3bbe-436f-9fe6-e2b0d3b05e69

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3be2cdf3-3bbe-436f-9fe6-e2b0d3b05e69
Content-Type: application/json

--- request body ---
{"handle":"qa-2c0db0157b6e","password":"****"}

--- response: 401 in 8 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3be2cdf3-3bbe-436f-9fe6-e2b0d3b05e69
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 320
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3be2cdf3-3bbe-436f-9fe6-e2b0d3b05e69"}
```
