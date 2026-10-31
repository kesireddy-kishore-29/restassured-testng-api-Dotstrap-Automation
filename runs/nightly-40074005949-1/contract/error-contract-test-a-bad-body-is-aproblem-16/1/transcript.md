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
| 1 | `POST /v1/accounts` | 201 | 18 | `qa-e48f9e8b-857a-4c3a-bcd8-2cf692a3bd7c` |
| 2 | `POST /v1/accounts` | 201 | 18 | `qa-8b1ff7f1-6ae1-4735-8a59-fde157a9b1e4` |
| 3 | `POST /v1/auth/token` | 200 | 28 | `qa-dadae2a2-5930-42bd-b05d-3752a1d8c05e` |
| 4 | `POST /v1/conversations` | 201 | 5 | `qa-203e40fb-96be-449c-92f0-2abc24d781fb` |
| 5 | `POST /v1/credits/purchases` | 415 | 10 | `qa-8edb5765-2aa4-496e-b964-50f951a5ce74` |
| 6 | `POST /v1/auth/token` | 200 | 19 | `qa-77acef2e-12cf-4819-89eb-19a05cc36263` |
| 7 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-05b6e27d-0f5f-496f-a634-8232118c2b6b` |
| 8 | `POST /v1/auth/token` | 401 | 9 | `qa-3a79a72d-6e30-4323-bcde-773d089f7ed0` |
| 9 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-ee2be9e8-1b8f-4963-b2ab-b47d2d9d6f03` |
| 10 | `POST /v1/auth/token` | 401 | 8 | `qa-ce4dd5c9-6d0b-43b3-bfb5-851972eea67a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e48f9e8b-857a-4c3a-bcd8-2cf692a3bd7c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e48f9e8b-857a-4c3a-bcd8-2cf692a3bd7c
Content-Type: application/json

--- request body ---
{"handle":"qa-4ebc613f67eb","displayName":"QA 4ebc613f67eb","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-e48f9e8b-857a-4c3a-bcd8-2cf692a3bd7c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 315
RateLimit-Reset: 7
Location: /v1/accounts/qa-4ebc613f67eb
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f04e3343-9150-4811-ac61-672214d51481","handle":"qa-4ebc613f67eb","displayName":"QA 4ebc613f67eb","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.972977909Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-8b1ff7f1-6ae1-4735-8a59-fde157a9b1e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8b1ff7f1-6ae1-4735-8a59-fde157a9b1e4
Content-Type: application/json

--- request body ---
{"handle":"qa-268dd9cab235","displayName":"QA 268dd9cab235","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-8b1ff7f1-6ae1-4735-8a59-fde157a9b1e4
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
Location: /v1/accounts/qa-268dd9cab235
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b1f821d3-e74a-46d6-8add-777c69fd33d1","handle":"qa-268dd9cab235","displayName":"QA 268dd9cab235","region":"eu","role":"user","createdAt":"2026-10-24T07:25:04.002057947Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-dadae2a2-5930-42bd-b05d-3752a1d8c05e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dadae2a2-5930-42bd-b05d-3752a1d8c05e
Content-Type: application/json

--- request body ---
{"handle":"qa-4ebc613f67eb","password":"****"}

--- response: 200 in 28 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-dadae2a2-5930-42bd-b05d-3752a1d8c05e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 307
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f04e3343-9150-4811-ac61-672214d51481"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-203e40fb-96be-449c-92f0-2abc24d781fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-203e40fb-96be-449c-92f0-2abc24d781fb
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-268dd9cab235","subject":"Error contract","message":"Hi"}

--- response: 201 in 5 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-203e40fb-96be-449c-92f0-2abc24d781fb
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
Location: /v1/conversations/cnv_e7098d37-5a98-4c9f-9f1a-75d8bfcde9ea
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_e7098d37-5a98-4c9f-9f1a-75d8bfcde9ea","subject":"Error contract","status":"open","region":"eu","participants":["qa-4ebc613f67eb","qa-268dd9cab235"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-24T07:25:04.055540160Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-8edb5765-2aa4-496e-b964-50f951a5ce74

--- request headers ---
Accept: application/json
Idempotency-Key: qa-f2a0c4b3ee924c418e64751f68a217c6
X-Correlation-Id: qa-8edb5765-2aa4-496e-b964-50f951a5ce74
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 10 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8edb5765-2aa4-496e-b964-50f951a5ce74
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

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/credits/purchases","correlationId":"qa-8edb5765-2aa4-496e-b964-50f951a5ce74"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-77acef2e-12cf-4819-89eb-19a05cc36263

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-77acef2e-12cf-4819-89eb-19a05cc36263
Content-Type: application/json

--- request body ---
{"handle":"qa-268dd9cab235","password":"****"}

--- response: 200 in 19 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-77acef2e-12cf-4819-89eb-19a05cc36263
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 300
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b1f821d3-e74a-46d6-8add-777c69fd33d1"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-05b6e27d-0f5f-496f-a634-8232118c2b6b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-05b6e27d-0f5f-496f-a634-8232118c2b6b
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-05b6e27d-0f5f-496f-a634-8232118c2b6b
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
correlation: qa-3a79a72d-6e30-4323-bcde-773d089f7ed0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a79a72d-6e30-4323-bcde-773d089f7ed0
Content-Type: application/json

--- request body ---
{"handle":"qa-268dd9cab235","password":"****"}

--- response: 401 in 9 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3a79a72d-6e30-4323-bcde-773d089f7ed0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 297
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3a79a72d-6e30-4323-bcde-773d089f7ed0"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ee2be9e8-1b8f-4963-b2ab-b47d2d9d6f03

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee2be9e8-1b8f-4963-b2ab-b47d2d9d6f03
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ee2be9e8-1b8f-4963-b2ab-b47d2d9d6f03
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
correlation: qa-ce4dd5c9-6d0b-43b3-bfb5-851972eea67a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce4dd5c9-6d0b-43b3-bfb5-851972eea67a
Content-Type: application/json

--- request body ---
{"handle":"qa-4ebc613f67eb","password":"****"}

--- response: 401 in 8 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ce4dd5c9-6d0b-43b3-bfb5-851972eea67a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 293
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ce4dd5c9-6d0b-43b3-bfb5-851972eea67a"}
```
