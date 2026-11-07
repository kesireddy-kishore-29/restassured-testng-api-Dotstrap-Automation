# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/credits/purchases, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[17]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 19 | `qa-86a26a71-696a-4989-b5ea-8fd2a64d4e25` |
| 2 | `POST /v1/accounts` | 201 | 35 | `qa-7f18e7a1-c699-473d-9c4d-706058a0e223` |
| 3 | `POST /v1/auth/token` | 200 | 38 | `qa-4f585d2f-dd08-44b9-9352-d51ef34aee92` |
| 4 | `POST /v1/conversations` | 201 | 15 | `qa-65e48e35-2a52-4cd3-83ab-9235d97247a8` |
| 5 | `POST /v1/credits/purchases` | 422 | 19 | `qa-9231dcfa-fee5-4d88-a068-205a11a5aec9` |
| 6 | `POST /v1/auth/token` | 200 | 34 | `qa-cb6c27db-1c1b-4881-b336-176460301095` |
| 7 | `DELETE /v1/accounts/me` | 204 | 26 | `qa-c075f369-9868-4bc3-992b-b0e42484ed74` |
| 8 | `POST /v1/auth/token` | 401 | 14 | `qa-e5add4c5-5ddc-44be-910b-429846abb60c` |
| 9 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-d02394b9-c456-4b8a-9e48-9a0ad8bbfddd` |
| 10 | `POST /v1/auth/token` | 401 | 12 | `qa-c3859909-7d8c-458a-910c-3c51d5ae8ba6` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-86a26a71-696a-4989-b5ea-8fd2a64d4e25

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-86a26a71-696a-4989-b5ea-8fd2a64d4e25
Content-Type: application/json

--- request body ---
{"handle":"qa-201704ca92ec","displayName":"QA 201704ca92ec","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-86a26a71-696a-4989-b5ea-8fd2a64d4e25
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 312
RateLimit-Reset: 6
Location: /v1/accounts/qa-201704ca92ec
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1f493438-b5be-4fa8-930b-ea2af298f3da","handle":"qa-201704ca92ec","displayName":"QA 201704ca92ec","region":"eu","role":"user","createdAt":"2026-11-06T09:30:34.742712861Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-7f18e7a1-c699-473d-9c4d-706058a0e223

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7f18e7a1-c699-473d-9c4d-706058a0e223
Content-Type: application/json

--- request body ---
{"handle":"qa-ab53baddc24f","displayName":"QA ab53baddc24f","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-7f18e7a1-c699-473d-9c4d-706058a0e223
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 309
RateLimit-Reset: 6
Location: /v1/accounts/qa-ab53baddc24f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d619b34b-a3bb-468a-9350-c76df463dec6","handle":"qa-ab53baddc24f","displayName":"QA ab53baddc24f","region":"eu","role":"user","createdAt":"2026-11-06T09:30:34.793183325Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-4f585d2f-dd08-44b9-9352-d51ef34aee92

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4f585d2f-dd08-44b9-9352-d51ef34aee92
Content-Type: application/json

--- request body ---
{"handle":"qa-201704ca92ec","password":"****"}

--- response: 200 in 38 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-4f585d2f-dd08-44b9-9352-d51ef34aee92
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 305
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1f493438-b5be-4fa8-930b-ea2af298f3da"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-65e48e35-2a52-4cd3-83ab-9235d97247a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-65e48e35-2a52-4cd3-83ab-9235d97247a8
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-ab53baddc24f","subject":"Error contract","message":"Hi"}

--- response: 201 in 15 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-65e48e35-2a52-4cd3-83ab-9235d97247a8
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
Location: /v1/conversations/cnv_6255ba5c-45fa-4cc6-8ca9-8884ae51e5ae
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_6255ba5c-45fa-4cc6-8ca9-8884ae51e5ae","subject":"Error contract","status":"open","region":"eu","participants":["qa-201704ca92ec","qa-ab53baddc24f"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-06T09:30:34.884329305Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-9231dcfa-fee5-4d88-a068-205a11a5aec9

--- request headers ---
Accept: application/json
Idempotency-Key: qa-cffc7caa24764e6486e5be16952b046a
X-Correlation-Id: qa-9231dcfa-fee5-4d88-a068-205a11a5aec9
Content-Type: application/json

--- request body ---
{"packId":"pack-0"}

--- response: 422 in 19 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9231dcfa-fee5-4d88-a068-205a11a5aec9
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
Content-Length: 315

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/credits/purchases","correlationId":"qa-9231dcfa-fee5-4d88-a068-205a11a5aec9","errors":[{"field":"packId","message":"one of: pack-10, pack-50"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-cb6c27db-1c1b-4881-b336-176460301095

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb6c27db-1c1b-4881-b336-176460301095
Content-Type: application/json

--- request body ---
{"handle":"qa-ab53baddc24f","password":"****"}

--- response: 200 in 34 ms ---
Date: Fri, 06 Nov 2026 09:30:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-cb6c27db-1c1b-4881-b336-176460301095
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 293
RateLimit-Reset: 5
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d619b34b-a3bb-468a-9350-c76df463dec6"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c075f369-9868-4bc3-992b-b0e42484ed74

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c075f369-9868-4bc3-992b-b0e42484ed74
Content-Type: application/json

--- response: 204 in 26 ms ---
Date: Fri, 06 Nov 2026 09:30:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c075f369-9868-4bc3-992b-b0e42484ed74
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
correlation: qa-e5add4c5-5ddc-44be-910b-429846abb60c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e5add4c5-5ddc-44be-910b-429846abb60c
Content-Type: application/json

--- request body ---
{"handle":"qa-ab53baddc24f","password":"****"}

--- response: 401 in 14 ms ---
Date: Fri, 06 Nov 2026 09:30:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e5add4c5-5ddc-44be-910b-429846abb60c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 290
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e5add4c5-5ddc-44be-910b-429846abb60c"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d02394b9-c456-4b8a-9e48-9a0ad8bbfddd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d02394b9-c456-4b8a-9e48-9a0ad8bbfddd
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Fri, 06 Nov 2026 09:30:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d02394b9-c456-4b8a-9e48-9a0ad8bbfddd
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
correlation: qa-c3859909-7d8c-458a-910c-3c51d5ae8ba6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c3859909-7d8c-458a-910c-3c51d5ae8ba6
Content-Type: application/json

--- request body ---
{"handle":"qa-201704ca92ec","password":"****"}

--- response: 401 in 12 ms ---
Date: Fri, 06 Nov 2026 09:30:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c3859909-7d8c-458a-910c-3c51d5ae8ba6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 284
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c3859909-7d8c-458a-910c-3c51d5ae8ba6"}
```
