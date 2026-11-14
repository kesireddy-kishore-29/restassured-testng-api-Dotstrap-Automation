# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/auth/token, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[0]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 46 | `qa-4dccb277-3219-40ad-8f7d-d86a69bf07fe` |
| 2 | `POST /v1/accounts` | 201 | 36 | `qa-ae1050e9-bbb4-4b78-84b5-60dd308533d4` |
| 3 | `POST /v1/auth/token` | 200 | 32 | `qa-0832d743-6da6-4f20-87f2-c03ac24ed74f` |
| 4 | `POST /v1/conversations` | 201 | 16 | `qa-d9b6c12b-79cc-4356-a183-f982b561f3ed` |
| 5 | `POST /v1/auth/token` | 400 | 23 | `qa-7f38156f-5e9d-4f8d-887a-9a35dbc1a82e` |
| 6 | `POST /v1/auth/token` | 200 | 23 | `qa-ba98554f-e22d-420c-ad93-5d215aa22bed` |
| 7 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-c4eaf8c9-5d1e-4949-906f-bb95bfefde2e` |
| 8 | `POST /v1/auth/token` | 401 | 31 | `qa-2bb89c36-b001-4916-97eb-154b558eb59b` |
| 9 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-7fe90637-ead1-4ff0-95a0-073db214ded2` |
| 10 | `POST /v1/auth/token` | 401 | 55 | `qa-90634ece-9e8d-498b-83ca-3bd8d892f906` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-4dccb277-3219-40ad-8f7d-d86a69bf07fe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4dccb277-3219-40ad-8f7d-d86a69bf07fe
Content-Type: application/json

--- request body ---
{"handle":"qa-83a048c9f8da","displayName":"QA 83a048c9f8da","password":"****","region":"eu"}

--- response: 201 in 46 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-4dccb277-3219-40ad-8f7d-d86a69bf07fe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 10
Location: /v1/accounts/qa-83a048c9f8da
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4f5ddf36-0d12-47d1-892c-b7f59f897360","handle":"qa-83a048c9f8da","displayName":"QA 83a048c9f8da","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.582571316Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-ae1050e9-bbb4-4b78-84b5-60dd308533d4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae1050e9-bbb4-4b78-84b5-60dd308533d4
Content-Type: application/json

--- request body ---
{"handle":"qa-29fa51d267a8","displayName":"QA 29fa51d267a8","password":"****","region":"eu"}

--- response: 201 in 36 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-ae1050e9-bbb4-4b78-84b5-60dd308533d4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 564
RateLimit-Reset: 10
Location: /v1/accounts/qa-29fa51d267a8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2302cd82-5f53-4c6f-802c-0fb52e2d86fd","handle":"qa-29fa51d267a8","displayName":"QA 29fa51d267a8","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.644144018Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-0832d743-6da6-4f20-87f2-c03ac24ed74f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0832d743-6da6-4f20-87f2-c03ac24ed74f
Content-Type: application/json

--- request body ---
{"handle":"qa-83a048c9f8da","password":"****"}

--- response: 200 in 32 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-0832d743-6da6-4f20-87f2-c03ac24ed74f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 554
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4f5ddf36-0d12-47d1-892c-b7f59f897360"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-d9b6c12b-79cc-4356-a183-f982b561f3ed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d9b6c12b-79cc-4356-a183-f982b561f3ed
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-29fa51d267a8","subject":"Error contract","message":"Hi"}

--- response: 201 in 16 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-d9b6c12b-79cc-4356-a183-f982b561f3ed
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
Location: /v1/conversations/cnv_72a28e30-2b0b-4882-976a-c3c93d48fdca
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_72a28e30-2b0b-4882-976a-c3c93d48fdca","subject":"Error contract","status":"open","region":"eu","participants":["qa-83a048c9f8da","qa-29fa51d267a8"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-13T09:42:05.723099186Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-7f38156f-5e9d-4f8d-887a-9a35dbc1a82e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7f38156f-5e9d-4f8d-887a-9a35dbc1a82e
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 23 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7f38156f-5e9d-4f8d-887a-9a35dbc1a82e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 548
RateLimit-Reset: 9
Content-Length: 255

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/auth/token","correlationId":"qa-7f38156f-5e9d-4f8d-887a-9a35dbc1a82e"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-ba98554f-e22d-420c-ad93-5d215aa22bed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ba98554f-e22d-420c-ad93-5d215aa22bed
Content-Type: application/json

--- request body ---
{"handle":"qa-29fa51d267a8","password":"****"}

--- response: 200 in 23 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-ba98554f-e22d-420c-ad93-5d215aa22bed
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 525
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2302cd82-5f53-4c6f-802c-0fb52e2d86fd"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c4eaf8c9-5d1e-4949-906f-bb95bfefde2e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c4eaf8c9-5d1e-4949-906f-bb95bfefde2e
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c4eaf8c9-5d1e-4949-906f-bb95bfefde2e
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
correlation: qa-2bb89c36-b001-4916-97eb-154b558eb59b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2bb89c36-b001-4916-97eb-154b558eb59b
Content-Type: application/json

--- request body ---
{"handle":"qa-29fa51d267a8","password":"****"}

--- response: 401 in 31 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2bb89c36-b001-4916-97eb-154b558eb59b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 520
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2bb89c36-b001-4916-97eb-154b558eb59b"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7fe90637-ead1-4ff0-95a0-073db214ded2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7fe90637-ead1-4ff0-95a0-073db214ded2
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7fe90637-ead1-4ff0-95a0-073db214ded2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 9
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-90634ece-9e8d-498b-83ca-3bd8d892f906

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-90634ece-9e8d-498b-83ca-3bd8d892f906
Content-Type: application/json

--- request body ---
{"handle":"qa-83a048c9f8da","password":"****"}

--- response: 401 in 55 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-90634ece-9e8d-498b-83ca-3bd8d892f906
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 499
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-90634ece-9e8d-498b-83ca-3bd8d892f906"}
```
