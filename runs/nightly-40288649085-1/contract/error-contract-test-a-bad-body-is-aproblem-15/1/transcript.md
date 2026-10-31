# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/credits/purchases, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[15]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 21 | `qa-d41a5bc1-004b-4b62-af13-31af87000ee9` |
| 2 | `POST /v1/accounts` | 201 | 18 | `qa-45f108f0-33b3-4bf6-aeba-7d9703cbe663` |
| 3 | `POST /v1/auth/token` | 200 | 16 | `qa-f557d09f-bfec-44d3-82b9-354a9bc38ca7` |
| 4 | `POST /v1/conversations` | 201 | 20 | `qa-5571a304-5450-4b2d-aa47-fcf1c787ed41` |
| 5 | `POST /v1/credits/purchases` | 400 | 7 | `qa-656caf39-3f43-4f44-9bf5-b024bfc6a6e6` |
| 6 | `POST /v1/auth/token` | 200 | 26 | `qa-15c5f08c-64cc-4924-8712-7ee9677e4815` |
| 7 | `DELETE /v1/accounts/me` | 204 | 29 | `qa-6fa8e887-1fc5-4a6e-8b88-626e69ec04a3` |
| 8 | `POST /v1/auth/token` | 401 | 7 | `qa-af53d2f3-917f-4d1f-b701-2728a48d1f7f` |
| 9 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-62089301-823c-490a-bec1-ea96a5f4caeb` |
| 10 | `POST /v1/auth/token` | 401 | 21 | `qa-522e76a4-55a5-4548-8abd-08fd621fed71` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d41a5bc1-004b-4b62-af13-31af87000ee9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d41a5bc1-004b-4b62-af13-31af87000ee9
Content-Type: application/json

--- request body ---
{"handle":"qa-69247f6afe1f","displayName":"QA 69247f6afe1f","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-d41a5bc1-004b-4b62-af13-31af87000ee9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 338
RateLimit-Reset: 7
Location: /v1/accounts/qa-69247f6afe1f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a857405b-55bf-480e-9a2e-6cbae3ca7a48","handle":"qa-69247f6afe1f","displayName":"QA 69247f6afe1f","region":"eu","role":"user","createdAt":"2026-10-26T07:54:48.628466445Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-45f108f0-33b3-4bf6-aeba-7d9703cbe663

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-45f108f0-33b3-4bf6-aeba-7d9703cbe663
Content-Type: application/json

--- request body ---
{"handle":"qa-cbe822bedaac","displayName":"QA cbe822bedaac","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-45f108f0-33b3-4bf6-aeba-7d9703cbe663
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 335
RateLimit-Reset: 7
Location: /v1/accounts/qa-cbe822bedaac
X-Served-Region: eu
Content-Length: 181

{"id":"acc_581c8b0d-91a4-42fb-ac1e-f0df3337b4ba","handle":"qa-cbe822bedaac","displayName":"QA cbe822bedaac","region":"eu","role":"user","createdAt":"2026-10-26T07:54:48.652492317Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-f557d09f-bfec-44d3-82b9-354a9bc38ca7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f557d09f-bfec-44d3-82b9-354a9bc38ca7
Content-Type: application/json

--- request body ---
{"handle":"qa-69247f6afe1f","password":"****"}

--- response: 200 in 16 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-f557d09f-bfec-44d3-82b9-354a9bc38ca7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 331
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a857405b-55bf-480e-9a2e-6cbae3ca7a48"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-5571a304-5450-4b2d-aa47-fcf1c787ed41

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5571a304-5450-4b2d-aa47-fcf1c787ed41
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-cbe822bedaac","subject":"Error contract","message":"Hi"}

--- response: 201 in 20 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-5571a304-5450-4b2d-aa47-fcf1c787ed41
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
Location: /v1/conversations/cnv_267ef172-29da-4325-93f9-c26018752981
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_267ef172-29da-4325-93f9-c26018752981","subject":"Error contract","status":"open","region":"eu","participants":["qa-69247f6afe1f","qa-cbe822bedaac"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-26T07:54:48.705820732Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-656caf39-3f43-4f44-9bf5-b024bfc6a6e6

--- request headers ---
Accept: application/json
Idempotency-Key: qa-9e1b755c45e04bfd98755b7b93403018
X-Correlation-Id: qa-656caf39-3f43-4f44-9bf5-b024bfc6a6e6
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 7 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-656caf39-3f43-4f44-9bf5-b024bfc6a6e6
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
Content-Length: 262

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/credits/purchases","correlationId":"qa-656caf39-3f43-4f44-9bf5-b024bfc6a6e6"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-15c5f08c-64cc-4924-8712-7ee9677e4815

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-15c5f08c-64cc-4924-8712-7ee9677e4815
Content-Type: application/json

--- request body ---
{"handle":"qa-cbe822bedaac","password":"****"}

--- response: 200 in 26 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-15c5f08c-64cc-4924-8712-7ee9677e4815
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 311
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_581c8b0d-91a4-42fb-ac1e-f0df3337b4ba"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6fa8e887-1fc5-4a6e-8b88-626e69ec04a3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6fa8e887-1fc5-4a6e-8b88-626e69ec04a3
Content-Type: application/json

--- response: 204 in 29 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6fa8e887-1fc5-4a6e-8b88-626e69ec04a3
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
correlation: qa-af53d2f3-917f-4d1f-b701-2728a48d1f7f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-af53d2f3-917f-4d1f-b701-2728a48d1f7f
Content-Type: application/json

--- request body ---
{"handle":"qa-cbe822bedaac","password":"****"}

--- response: 401 in 7 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-af53d2f3-917f-4d1f-b701-2728a48d1f7f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 304
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-af53d2f3-917f-4d1f-b701-2728a48d1f7f"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-62089301-823c-490a-bec1-ea96a5f4caeb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-62089301-823c-490a-bec1-ea96a5f4caeb
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: text/plain
X-Correlation-Id: qa-62089301-823c-490a-bec1-ea96a5f4caeb
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
correlation: qa-522e76a4-55a5-4548-8abd-08fd621fed71

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-522e76a4-55a5-4548-8abd-08fd621fed71
Content-Type: application/json

--- request body ---
{"handle":"qa-69247f6afe1f","password":"****"}

--- response: 401 in 21 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-522e76a4-55a5-4548-8abd-08fd621fed71
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 301
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-522e76a4-55a5-4548-8abd-08fd621fed71"}
```
