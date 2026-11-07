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
| 1 | `POST /v1/accounts` | 201 | 38 | `qa-62497c6c-8acc-4a8e-8ef0-9a8d32a186c6` |
| 2 | `POST /v1/accounts` | 201 | 48 | `qa-bd7fd2ed-f13b-47d1-bf92-21d39827b93a` |
| 3 | `POST /v1/auth/token` | 200 | 25 | `qa-d55846e9-6cd8-4eac-99d3-7526f396962f` |
| 4 | `POST /v1/conversations` | 201 | 18 | `qa-2afed13d-75dc-414b-a0f5-9f197ca3d7c9` |
| 5 | `POST /v1/credits/purchases` | 400 | 22 | `qa-ce58bf9a-0577-45bf-8795-141ceb29485b` |
| 6 | `POST /v1/auth/token` | 200 | 31 | `qa-7f26d2c3-006b-4127-a7ec-9a5982e66163` |
| 7 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-2d565dd8-312b-465b-9dda-95e0384b46cc` |
| 8 | `POST /v1/auth/token` | 401 | 6 | `qa-77840916-fa71-4eb1-9e84-43caf5540afc` |
| 9 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-99999b1e-7e24-4abd-9eb4-f50877ab9424` |
| 10 | `POST /v1/auth/token` | 401 | 15 | `qa-972997ce-3bdc-4907-964b-9c114d43cfef` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-62497c6c-8acc-4a8e-8ef0-9a8d32a186c6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-62497c6c-8acc-4a8e-8ef0-9a8d32a186c6
Content-Type: application/json

--- request body ---
{"handle":"qa-8df78fc40f5b","displayName":"QA 8df78fc40f5b","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-62497c6c-8acc-4a8e-8ef0-9a8d32a186c6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 364
RateLimit-Reset: 7
Location: /v1/accounts/qa-8df78fc40f5b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e28284b4-daab-4b64-8fc0-dba37164f95d","handle":"qa-8df78fc40f5b","displayName":"QA 8df78fc40f5b","region":"eu","role":"user","createdAt":"2026-10-29T08:39:01.099696314Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-bd7fd2ed-f13b-47d1-bf92-21d39827b93a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bd7fd2ed-f13b-47d1-bf92-21d39827b93a
Content-Type: application/json

--- request body ---
{"handle":"qa-702cf45ef237","displayName":"QA 702cf45ef237","password":"****","region":"eu"}

--- response: 201 in 48 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-bd7fd2ed-f13b-47d1-bf92-21d39827b93a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 362
RateLimit-Reset: 7
Location: /v1/accounts/qa-702cf45ef237
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5cc98645-8197-424f-aecb-928adb022575","handle":"qa-702cf45ef237","displayName":"QA 702cf45ef237","region":"eu","role":"user","createdAt":"2026-10-29T08:39:01.156729431Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-d55846e9-6cd8-4eac-99d3-7526f396962f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d55846e9-6cd8-4eac-99d3-7526f396962f
Content-Type: application/json

--- request body ---
{"handle":"qa-8df78fc40f5b","password":"****"}

--- response: 200 in 25 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-d55846e9-6cd8-4eac-99d3-7526f396962f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 360
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e28284b4-daab-4b64-8fc0-dba37164f95d"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-2afed13d-75dc-414b-a0f5-9f197ca3d7c9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2afed13d-75dc-414b-a0f5-9f197ca3d7c9
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-702cf45ef237","subject":"Error contract","message":"Hi"}

--- response: 201 in 18 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-2afed13d-75dc-414b-a0f5-9f197ca3d7c9
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
Location: /v1/conversations/cnv_d84841fe-ee48-4861-9e06-c6cd6485c22b
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_d84841fe-ee48-4861-9e06-c6cd6485c22b","subject":"Error contract","status":"open","region":"eu","participants":["qa-8df78fc40f5b","qa-702cf45ef237"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-29T08:39:01.226492975Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-ce58bf9a-0577-45bf-8795-141ceb29485b

--- request headers ---
Accept: application/json
Idempotency-Key: qa-961e739f7f6c43f397fc43d1954671d9
X-Correlation-Id: qa-ce58bf9a-0577-45bf-8795-141ceb29485b
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 22 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ce58bf9a-0577-45bf-8795-141ceb29485b
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

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/credits/purchases","correlationId":"qa-ce58bf9a-0577-45bf-8795-141ceb29485b"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-7f26d2c3-006b-4127-a7ec-9a5982e66163

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7f26d2c3-006b-4127-a7ec-9a5982e66163
Content-Type: application/json

--- request body ---
{"handle":"qa-702cf45ef237","password":"****"}

--- response: 200 in 31 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-7f26d2c3-006b-4127-a7ec-9a5982e66163
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 341
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5cc98645-8197-424f-aecb-928adb022575"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2d565dd8-312b-465b-9dda-95e0384b46cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2d565dd8-312b-465b-9dda-95e0384b46cc
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2d565dd8-312b-465b-9dda-95e0384b46cc
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
correlation: qa-77840916-fa71-4eb1-9e84-43caf5540afc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-77840916-fa71-4eb1-9e84-43caf5540afc
Content-Type: application/json

--- request body ---
{"handle":"qa-702cf45ef237","password":"****"}

--- response: 401 in 6 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-77840916-fa71-4eb1-9e84-43caf5540afc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 333
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-77840916-fa71-4eb1-9e84-43caf5540afc"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-99999b1e-7e24-4abd-9eb4-f50877ab9424

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-99999b1e-7e24-4abd-9eb4-f50877ab9424
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: text/plain
X-Correlation-Id: qa-99999b1e-7e24-4abd-9eb4-f50877ab9424
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
correlation: qa-972997ce-3bdc-4907-964b-9c114d43cfef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-972997ce-3bdc-4907-964b-9c114d43cfef
Content-Type: application/json

--- request body ---
{"handle":"qa-8df78fc40f5b","password":"****"}

--- response: 401 in 15 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-972997ce-3bdc-4907-964b-9c114d43cfef
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 327
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-972997ce-3bdc-4907-964b-9c114d43cfef"}
```
