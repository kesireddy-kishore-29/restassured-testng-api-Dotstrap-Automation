# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[9]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 45 | `qa-0ca86588-68f6-4457-8a52-c87ce901bea9` |
| 2 | `POST /v1/accounts` | 201 | 30 | `qa-ae88f646-0ccf-4d05-bd8a-4c47b71e7581` |
| 3 | `POST /v1/auth/token` | 200 | 30 | `qa-d02e2a0e-491b-4c76-a078-2fb7d60ea5c5` |
| 4 | `POST /v1/conversations` | 201 | 17 | `qa-2186a9a0-66e4-409a-b056-9fcf150bfb74` |
| 5 | `POST /v1/conversations` | 400 | 18 | `qa-d504343a-d1e3-4754-99bf-0255271f3a6e` |
| 6 | `POST /v1/auth/token` | 200 | 18 | `qa-d0fea5dc-7dd2-4557-a6d8-248fa8a4fb94` |
| 7 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-1fd31146-5c8c-44ef-ac77-b8eceda306c8` |
| 8 | `POST /v1/auth/token` | 401 | 19 | `qa-93d3846f-5890-457e-b7e5-9d4f5d7f36d8` |
| 9 | `DELETE /v1/accounts/me` | 204 | 44 | `qa-e3b97add-5796-4ad0-bec4-20eefde04304` |
| 10 | `POST /v1/auth/token` | 401 | 27 | `qa-560f0d1d-716c-4ea8-b05e-029f3bd8e102` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0ca86588-68f6-4457-8a52-c87ce901bea9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ca86588-68f6-4457-8a52-c87ce901bea9
Content-Type: application/json

--- request body ---
{"handle":"qa-3853d9259e6d","displayName":"QA 3853d9259e6d","password":"****","region":"eu"}

--- response: 201 in 45 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-0ca86588-68f6-4457-8a52-c87ce901bea9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 433
RateLimit-Reset: 7
Location: /v1/accounts/qa-3853d9259e6d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2fd90ed7-9541-4684-9628-357f035c2d4d","handle":"qa-3853d9259e6d","displayName":"QA 3853d9259e6d","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.665086689Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-ae88f646-0ccf-4d05-bd8a-4c47b71e7581

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae88f646-0ccf-4d05-bd8a-4c47b71e7581
Content-Type: application/json

--- request body ---
{"handle":"qa-cd010eb5321f","displayName":"QA cd010eb5321f","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-ae88f646-0ccf-4d05-bd8a-4c47b71e7581
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 427
RateLimit-Reset: 7
Location: /v1/accounts/qa-cd010eb5321f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_aef13e28-f931-424f-894d-b42cc648db5d","handle":"qa-cd010eb5321f","displayName":"QA cd010eb5321f","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.740672157Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-d02e2a0e-491b-4c76-a078-2fb7d60ea5c5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d02e2a0e-491b-4c76-a078-2fb7d60ea5c5
Content-Type: application/json

--- request body ---
{"handle":"qa-3853d9259e6d","password":"****"}

--- response: 200 in 30 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-d02e2a0e-491b-4c76-a078-2fb7d60ea5c5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 418
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2fd90ed7-9541-4684-9628-357f035c2d4d"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-2186a9a0-66e4-409a-b056-9fcf150bfb74

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2186a9a0-66e4-409a-b056-9fcf150bfb74
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-cd010eb5321f","subject":"Error contract","message":"Hi"}

--- response: 201 in 17 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-2186a9a0-66e4-409a-b056-9fcf150bfb74
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
Location: /v1/conversations/cnv_0ae5617e-2028-49be-90ca-70d0c90dc6f0
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_0ae5617e-2028-49be-90ca-70d0c90dc6f0","subject":"Error contract","status":"open","region":"eu","participants":["qa-3853d9259e6d","qa-cd010eb5321f"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-31T08:31:35.822783698Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-d504343a-d1e3-4754-99bf-0255271f3a6e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d504343a-d1e3-4754-99bf-0255271f3a6e
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 18 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d504343a-d1e3-4754-99bf-0255271f3a6e
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
Content-Length: 258

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/conversations","correlationId":"qa-d504343a-d1e3-4754-99bf-0255271f3a6e"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-d0fea5dc-7dd2-4557-a6d8-248fa8a4fb94

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d0fea5dc-7dd2-4557-a6d8-248fa8a4fb94
Content-Type: application/json

--- request body ---
{"handle":"qa-cd010eb5321f","password":"****"}

--- response: 200 in 18 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-d0fea5dc-7dd2-4557-a6d8-248fa8a4fb94
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 407
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_aef13e28-f931-424f-894d-b42cc648db5d"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1fd31146-5c8c-44ef-ac77-b8eceda306c8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1fd31146-5c8c-44ef-ac77-b8eceda306c8
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1fd31146-5c8c-44ef-ac77-b8eceda306c8
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
correlation: qa-93d3846f-5890-457e-b7e5-9d4f5d7f36d8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-93d3846f-5890-457e-b7e5-9d4f5d7f36d8
Content-Type: application/json

--- request body ---
{"handle":"qa-cd010eb5321f","password":"****"}

--- response: 401 in 19 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-93d3846f-5890-457e-b7e5-9d4f5d7f36d8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 405
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-93d3846f-5890-457e-b7e5-9d4f5d7f36d8"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e3b97add-5796-4ad0-bec4-20eefde04304

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e3b97add-5796-4ad0-bec4-20eefde04304
Content-Type: application/json

--- response: 204 in 44 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e3b97add-5796-4ad0-bec4-20eefde04304
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
correlation: qa-560f0d1d-716c-4ea8-b05e-029f3bd8e102

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-560f0d1d-716c-4ea8-b05e-029f3bd8e102
Content-Type: application/json

--- request body ---
{"handle":"qa-3853d9259e6d","password":"****"}

--- response: 401 in 27 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-560f0d1d-716c-4ea8-b05e-029f3bd8e102
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-560f0d1d-716c-4ea8-b05e-029f3bd8e102"}
```
