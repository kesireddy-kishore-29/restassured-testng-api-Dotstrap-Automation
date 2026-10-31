# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [PATCH /v1/accounts/me, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[8]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 19 | `qa-47b3faa9-a48d-4993-bc2d-dbc8c9365590` |
| 2 | `POST /v1/accounts` | 201 | 23 | `qa-231bf0b6-6bce-46cf-a7fd-abd58f6c4063` |
| 3 | `POST /v1/auth/token` | 200 | 45 | `qa-0288e275-df71-4518-adc8-63579be3b76a` |
| 4 | `POST /v1/conversations` | 201 | 19 | `qa-045d09f0-be2a-4538-8964-0cbac072f043` |
| 5 | `PATCH /v1/accounts/me` | 422 | 22 | `qa-28c20fa9-8375-4496-840a-de6293d4fb01` |
| 6 | `POST /v1/auth/token` | 200 | 34 | `qa-b9715a84-ec60-4668-913b-9e428cd776a9` |
| 7 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-af75b831-6811-44b0-aa85-da91502da7c4` |
| 8 | `POST /v1/auth/token` | 401 | 26 | `qa-7f12f079-8423-4976-b999-84e7d60e341e` |
| 9 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-07be9e56-e850-4c0e-90d4-a65f78dfedac` |
| 10 | `POST /v1/auth/token` | 401 | 44 | `qa-ffccda6e-1dfb-4057-a6f4-0cafea10837c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-47b3faa9-a48d-4993-bc2d-dbc8c9365590

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-47b3faa9-a48d-4993-bc2d-dbc8c9365590
Content-Type: application/json

--- request body ---
{"handle":"qa-6f11e9481a6a","displayName":"QA 6f11e9481a6a","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-47b3faa9-a48d-4993-bc2d-dbc8c9365590
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 416
RateLimit-Reset: 7
Location: /v1/accounts/qa-6f11e9481a6a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_36b77928-e115-4810-b96e-25af3f5d1cea","handle":"qa-6f11e9481a6a","displayName":"QA 6f11e9481a6a","region":"eu","role":"user","createdAt":"2026-10-23T07:41:46.067280864Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-231bf0b6-6bce-46cf-a7fd-abd58f6c4063

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-231bf0b6-6bce-46cf-a7fd-abd58f6c4063
Content-Type: application/json

--- request body ---
{"handle":"qa-5a018920a4e0","displayName":"QA 5a018920a4e0","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-231bf0b6-6bce-46cf-a7fd-abd58f6c4063
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 412
RateLimit-Reset: 7
Location: /v1/accounts/qa-5a018920a4e0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_442a0149-4bac-4da5-9022-2aa43aa28402","handle":"qa-5a018920a4e0","displayName":"QA 5a018920a4e0","region":"eu","role":"user","createdAt":"2026-10-23T07:41:46.106924484Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-0288e275-df71-4518-adc8-63579be3b76a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0288e275-df71-4518-adc8-63579be3b76a
Content-Type: application/json

--- request body ---
{"handle":"qa-6f11e9481a6a","password":"****"}

--- response: 200 in 45 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-0288e275-df71-4518-adc8-63579be3b76a
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_36b77928-e115-4810-b96e-25af3f5d1cea"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-045d09f0-be2a-4538-8964-0cbac072f043

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-045d09f0-be2a-4538-8964-0cbac072f043
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-5a018920a4e0","subject":"Error contract","message":"Hi"}

--- response: 201 in 19 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-045d09f0-be2a-4538-8964-0cbac072f043
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
Location: /v1/conversations/cnv_8a63c4bb-70c4-447a-899d-f69dbe6a4d08
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_8a63c4bb-70c4-447a-899d-f69dbe6a4d08","subject":"Error contract","status":"open","region":"eu","participants":["qa-6f11e9481a6a","qa-5a018920a4e0"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-23T07:41:46.218011674Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-28c20fa9-8375-4496-840a-de6293d4fb01

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-28c20fa9-8375-4496-840a-de6293d4fb01
Content-Type: application/json

--- request body ---
{"displayName":"   "}

--- response: 422 in 22 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-28c20fa9-8375-4496-840a-de6293d4fb01
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
Content-Length: 316

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts/me","correlationId":"qa-28c20fa9-8375-4496-840a-de6293d4fb01","errors":[{"field":"displayName","message":"1-60 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-b9715a84-ec60-4668-913b-9e428cd776a9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b9715a84-ec60-4668-913b-9e428cd776a9
Content-Type: application/json

--- request body ---
{"handle":"qa-5a018920a4e0","password":"****"}

--- response: 200 in 34 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-b9715a84-ec60-4668-913b-9e428cd776a9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 382
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_442a0149-4bac-4da5-9022-2aa43aa28402"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-af75b831-6811-44b0-aa85-da91502da7c4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-af75b831-6811-44b0-aa85-da91502da7c4
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: text/plain
X-Correlation-Id: qa-af75b831-6811-44b0-aa85-da91502da7c4
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
correlation: qa-7f12f079-8423-4976-b999-84e7d60e341e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7f12f079-8423-4976-b999-84e7d60e341e
Content-Type: application/json

--- request body ---
{"handle":"qa-5a018920a4e0","password":"****"}

--- response: 401 in 26 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7f12f079-8423-4976-b999-84e7d60e341e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 372
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7f12f079-8423-4976-b999-84e7d60e341e"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-07be9e56-e850-4c0e-90d4-a65f78dfedac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-07be9e56-e850-4c0e-90d4-a65f78dfedac
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: text/plain
X-Correlation-Id: qa-07be9e56-e850-4c0e-90d4-a65f78dfedac
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
correlation: qa-ffccda6e-1dfb-4057-a6f4-0cafea10837c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ffccda6e-1dfb-4057-a6f4-0cafea10837c
Content-Type: application/json

--- request body ---
{"handle":"qa-6f11e9481a6a","password":"****"}

--- response: 401 in 44 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ffccda6e-1dfb-4057-a6f4-0cafea10837c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 363
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ffccda6e-1dfb-4057-a6f4-0cafea10837c"}
```
