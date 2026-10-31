# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/accounts, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[5]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 20 | `qa-766b920e-8f75-4bd3-bfe1-8f085affa645` |
| 2 | `POST /v1/accounts` | 201 | 22 | `qa-35e8b500-d6df-4b3a-85fa-6d7d60679d2e` |
| 3 | `POST /v1/auth/token` | 200 | 26 | `qa-31a4037c-39cb-479c-9a6b-e04ffa79cd19` |
| 4 | `POST /v1/conversations` | 201 | 8 | `qa-b23fcec8-7ab5-4129-93c1-6840ddbac5e9` |
| 5 | `POST /v1/accounts` | 422 | 15 | `qa-5187a163-ca26-44f3-97a2-c0213203a634` |
| 6 | `POST /v1/auth/token` | 200 | 19 | `qa-2f992168-53e7-4b3a-b721-51815067ccd5` |
| 7 | `DELETE /v1/accounts/me` | 204 | 29 | `qa-45c44796-6693-4025-8657-211475c33e03` |
| 8 | `POST /v1/auth/token` | 401 | 46 | `qa-85cc846e-b984-46ec-a60f-b957a5bb9436` |
| 9 | `DELETE /v1/accounts/me` | 204 | 28 | `qa-1d9150f1-b3d4-4414-917c-e8e3ccd97887` |
| 10 | `POST /v1/auth/token` | 401 | 13 | `qa-2bee7f80-8978-40b0-a0c3-87ef86328ed4` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-766b920e-8f75-4bd3-bfe1-8f085affa645

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-766b920e-8f75-4bd3-bfe1-8f085affa645
Content-Type: application/json

--- request body ---
{"handle":"qa-ce428d3d6063","displayName":"QA ce428d3d6063","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-766b920e-8f75-4bd3-bfe1-8f085affa645
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 469
RateLimit-Reset: 9
Location: /v1/accounts/qa-ce428d3d6063
X-Served-Region: eu
Content-Length: 181

{"id":"acc_bb79af1a-2149-4bb6-a397-7aa3c3ee6945","handle":"qa-ce428d3d6063","displayName":"QA ce428d3d6063","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.355607220Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-35e8b500-d6df-4b3a-85fa-6d7d60679d2e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35e8b500-d6df-4b3a-85fa-6d7d60679d2e
Content-Type: application/json

--- request body ---
{"handle":"qa-9f7225060e46","displayName":"QA 9f7225060e46","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-35e8b500-d6df-4b3a-85fa-6d7d60679d2e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 459
RateLimit-Reset: 9
Location: /v1/accounts/qa-9f7225060e46
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c332aec0-f6a5-4a2f-b5d4-2235136940ec","handle":"qa-9f7225060e46","displayName":"QA 9f7225060e46","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.383121011Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-31a4037c-39cb-479c-9a6b-e04ffa79cd19

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-31a4037c-39cb-479c-9a6b-e04ffa79cd19
Content-Type: application/json

--- request body ---
{"handle":"qa-ce428d3d6063","password":"****"}

--- response: 200 in 26 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-31a4037c-39cb-479c-9a6b-e04ffa79cd19
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 452
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bb79af1a-2149-4bb6-a397-7aa3c3ee6945"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-b23fcec8-7ab5-4129-93c1-6840ddbac5e9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b23fcec8-7ab5-4129-93c1-6840ddbac5e9
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-9f7225060e46","subject":"Error contract","message":"Hi"}

--- response: 201 in 8 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-b23fcec8-7ab5-4129-93c1-6840ddbac5e9
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
Location: /v1/conversations/cnv_eef8a986-b9bf-4965-b8a5-52da4603b1f8
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_eef8a986-b9bf-4965-b8a5-52da4603b1f8","subject":"Error contract","status":"open","region":"eu","participants":["qa-ce428d3d6063","qa-9f7225060e46"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-28T08:42:52.441826601Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-5187a163-ca26-44f3-97a2-c0213203a634

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5187a163-ca26-44f3-97a2-c0213203a634
Content-Type: application/json

--- request body ---
{"handle":"ab","displayName":"Name","password":"****","region":"eu"}

--- response: 422 in 15 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5187a163-ca26-44f3-97a2-c0213203a634
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 446
RateLimit-Reset: 9
Content-Length: 338

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-5187a163-ca26-44f3-97a2-c0213203a634","errors":[{"field":"handle","message":"3-30 characters: a-z, 0-9 and '-', not starting with '-'"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-2f992168-53e7-4b3a-b721-51815067ccd5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2f992168-53e7-4b3a-b721-51815067ccd5
Content-Type: application/json

--- request body ---
{"handle":"qa-9f7225060e46","password":"****"}

--- response: 200 in 19 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-2f992168-53e7-4b3a-b721-51815067ccd5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 430
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c332aec0-f6a5-4a2f-b5d4-2235136940ec"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-45c44796-6693-4025-8657-211475c33e03

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-45c44796-6693-4025-8657-211475c33e03
Content-Type: application/json

--- response: 204 in 29 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-45c44796-6693-4025-8657-211475c33e03
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
correlation: qa-85cc846e-b984-46ec-a60f-b957a5bb9436

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-85cc846e-b984-46ec-a60f-b957a5bb9436
Content-Type: application/json

--- request body ---
{"handle":"qa-9f7225060e46","password":"****"}

--- response: 401 in 46 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-85cc846e-b984-46ec-a60f-b957a5bb9436
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 412
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-85cc846e-b984-46ec-a60f-b957a5bb9436"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1d9150f1-b3d4-4414-917c-e8e3ccd97887

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1d9150f1-b3d4-4414-917c-e8e3ccd97887
Content-Type: application/json

--- response: 204 in 28 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1d9150f1-b3d4-4414-917c-e8e3ccd97887
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
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-2bee7f80-8978-40b0-a0c3-87ef86328ed4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2bee7f80-8978-40b0-a0c3-87ef86328ed4
Content-Type: application/json

--- request body ---
{"handle":"qa-ce428d3d6063","password":"****"}

--- response: 401 in 13 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2bee7f80-8978-40b0-a0c3-87ef86328ed4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 402
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2bee7f80-8978-40b0-a0c3-87ef86328ed4"}
```
