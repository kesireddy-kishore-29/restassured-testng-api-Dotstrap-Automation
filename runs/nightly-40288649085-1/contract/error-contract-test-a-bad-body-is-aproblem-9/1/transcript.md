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
| 1 | `POST /v1/accounts` | 201 | 19 | `qa-14d9da4a-c617-434c-b3a6-2e025b8a35ca` |
| 2 | `POST /v1/accounts` | 201 | 22 | `qa-a6e1ffd5-284d-49bd-bcbb-a8adf577d0ea` |
| 3 | `POST /v1/auth/token` | 200 | 27 | `qa-6fc2fb58-1531-4919-9b1b-c6363b40a0e7` |
| 4 | `POST /v1/conversations` | 201 | 10 | `qa-63973a4d-a339-4373-934a-cc8c4a25cb1b` |
| 5 | `POST /v1/conversations` | 400 | 10 | `qa-34c12cc9-e41b-483d-94a8-f04fe1327787` |
| 6 | `POST /v1/auth/token` | 200 | 26 | `qa-fc8fa37e-5d51-4c0d-ae18-b214ba6c2cf2` |
| 7 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-db90047e-3d54-4a59-b586-c9fee1902092` |
| 8 | `POST /v1/auth/token` | 401 | 12 | `qa-7341dbe8-f5ea-42fa-9c73-803bbe95ec3c` |
| 9 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-b49a7215-4f2c-4691-babb-4b4c412cc12e` |
| 10 | `POST /v1/auth/token` | 401 | 18 | `qa-753d8804-6fd6-46f8-9084-51fd70522655` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-14d9da4a-c617-434c-b3a6-2e025b8a35ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-14d9da4a-c617-434c-b3a6-2e025b8a35ca
Content-Type: application/json

--- request body ---
{"handle":"qa-f61af32cd49d","displayName":"QA f61af32cd49d","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-14d9da4a-c617-434c-b3a6-2e025b8a35ca
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 407
RateLimit-Reset: 8
Location: /v1/accounts/qa-f61af32cd49d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a139aaa2-8aa2-466b-b897-35a1625bf813","handle":"qa-f61af32cd49d","displayName":"QA f61af32cd49d","region":"eu","role":"user","createdAt":"2026-10-26T07:54:48.076735658Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a6e1ffd5-284d-49bd-bcbb-a8adf577d0ea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a6e1ffd5-284d-49bd-bcbb-a8adf577d0ea
Content-Type: application/json

--- request body ---
{"handle":"qa-63d79b481208","displayName":"QA 63d79b481208","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-a6e1ffd5-284d-49bd-bcbb-a8adf577d0ea
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 401
RateLimit-Reset: 8
Location: /v1/accounts/qa-63d79b481208
X-Served-Region: eu
Content-Length: 181

{"id":"acc_86f84ea4-5b28-4747-8c22-42c4abe6233d","handle":"qa-63d79b481208","displayName":"QA 63d79b481208","region":"eu","role":"user","createdAt":"2026-10-26T07:54:48.110338213Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-6fc2fb58-1531-4919-9b1b-c6363b40a0e7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6fc2fb58-1531-4919-9b1b-c6363b40a0e7
Content-Type: application/json

--- request body ---
{"handle":"qa-f61af32cd49d","password":"****"}

--- response: 200 in 27 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-6fc2fb58-1531-4919-9b1b-c6363b40a0e7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 394
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a139aaa2-8aa2-466b-b897-35a1625bf813"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-63973a4d-a339-4373-934a-cc8c4a25cb1b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-63973a4d-a339-4373-934a-cc8c4a25cb1b
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-63d79b481208","subject":"Error contract","message":"Hi"}

--- response: 201 in 10 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-63973a4d-a339-4373-934a-cc8c4a25cb1b
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
Location: /v1/conversations/cnv_c9f23123-c0ee-403c-984e-be076a5e2920
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_c9f23123-c0ee-403c-984e-be076a5e2920","subject":"Error contract","status":"open","region":"eu","participants":["qa-f61af32cd49d","qa-63d79b481208"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-26T07:54:48.166037811Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-34c12cc9-e41b-483d-94a8-f04fe1327787

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-34c12cc9-e41b-483d-94a8-f04fe1327787
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 10 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-34c12cc9-e41b-483d-94a8-f04fe1327787
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

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/conversations","correlationId":"qa-34c12cc9-e41b-483d-94a8-f04fe1327787"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-fc8fa37e-5d51-4c0d-ae18-b214ba6c2cf2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fc8fa37e-5d51-4c0d-ae18-b214ba6c2cf2
Content-Type: application/json

--- request body ---
{"handle":"qa-63d79b481208","password":"****"}

--- response: 200 in 26 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-fc8fa37e-5d51-4c0d-ae18-b214ba6c2cf2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 382
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_86f84ea4-5b28-4747-8c22-42c4abe6233d"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-db90047e-3d54-4a59-b586-c9fee1902092

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-db90047e-3d54-4a59-b586-c9fee1902092
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: text/plain
X-Correlation-Id: qa-db90047e-3d54-4a59-b586-c9fee1902092
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
correlation: qa-7341dbe8-f5ea-42fa-9c73-803bbe95ec3c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7341dbe8-f5ea-42fa-9c73-803bbe95ec3c
Content-Type: application/json

--- request body ---
{"handle":"qa-63d79b481208","password":"****"}

--- response: 401 in 12 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7341dbe8-f5ea-42fa-9c73-803bbe95ec3c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 375
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7341dbe8-f5ea-42fa-9c73-803bbe95ec3c"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b49a7215-4f2c-4691-babb-4b4c412cc12e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b49a7215-4f2c-4691-babb-4b4c412cc12e
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b49a7215-4f2c-4691-babb-4b4c412cc12e
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
correlation: qa-753d8804-6fd6-46f8-9084-51fd70522655

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-753d8804-6fd6-46f8-9084-51fd70522655
Content-Type: application/json

--- request body ---
{"handle":"qa-f61af32cd49d","password":"****"}

--- response: 401 in 18 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-753d8804-6fd6-46f8-9084-51fd70522655
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 368
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-753d8804-6fd6-46f8-9084-51fd70522655"}
```
