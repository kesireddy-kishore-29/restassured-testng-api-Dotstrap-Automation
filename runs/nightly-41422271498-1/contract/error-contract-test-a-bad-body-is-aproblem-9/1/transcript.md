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
| 1 | `POST /v1/accounts` | 201 | 13 | `qa-95d66945-000c-47d2-bb30-7ac76fb486f7` |
| 2 | `POST /v1/accounts` | 201 | 38 | `qa-7a0d7f19-a3a6-486b-876d-dbc5d9dfec96` |
| 3 | `POST /v1/auth/token` | 200 | 24 | `qa-06edb4ab-010e-46fc-bb90-f3c6106fd96a` |
| 4 | `POST /v1/conversations` | 201 | 9 | `qa-e1d2cf90-fb72-400d-90eb-ef3690a9d289` |
| 5 | `POST /v1/conversations` | 400 | 14 | `qa-34673ffe-1ca0-4040-9c66-336a6b3dcc49` |
| 6 | `POST /v1/auth/token` | 200 | 23 | `qa-eb2f835c-be1f-45c8-8669-4b56c6f634b1` |
| 7 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-16236c3f-64ef-423f-8206-98c8611469f4` |
| 8 | `POST /v1/auth/token` | 401 | 12 | `qa-70d17e6d-5029-45dd-8784-71e4f970ab96` |
| 9 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-30942461-fb77-4f72-8d2f-1de90f780c13` |
| 10 | `POST /v1/auth/token` | 401 | 23 | `qa-98ef81a8-3212-4885-8724-2fa268f0b7fd` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-95d66945-000c-47d2-bb30-7ac76fb486f7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-95d66945-000c-47d2-bb30-7ac76fb486f7
Content-Type: application/json

--- request body ---
{"handle":"qa-58d941141835","displayName":"QA 58d941141835","password":"****","region":"eu"}

--- response: 201 in 13 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-95d66945-000c-47d2-bb30-7ac76fb486f7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 434
RateLimit-Reset: 8
Location: /v1/accounts/qa-58d941141835
X-Served-Region: eu
Content-Length: 181

{"id":"acc_04dfdcf0-a129-46ae-9f6a-fa9b9b57ef82","handle":"qa-58d941141835","displayName":"QA 58d941141835","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.793496311Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-7a0d7f19-a3a6-486b-876d-dbc5d9dfec96

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7a0d7f19-a3a6-486b-876d-dbc5d9dfec96
Content-Type: application/json

--- request body ---
{"handle":"qa-d5a0ce0ca362","displayName":"QA d5a0ce0ca362","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-7a0d7f19-a3a6-486b-876d-dbc5d9dfec96
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 427
RateLimit-Reset: 8
Location: /v1/accounts/qa-d5a0ce0ca362
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d516b94b-e648-43b3-aaff-1dd37b569f51","handle":"qa-d5a0ce0ca362","displayName":"QA d5a0ce0ca362","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.827066685Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-06edb4ab-010e-46fc-bb90-f3c6106fd96a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-06edb4ab-010e-46fc-bb90-f3c6106fd96a
Content-Type: application/json

--- request body ---
{"handle":"qa-58d941141835","password":"****"}

--- response: 200 in 24 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-06edb4ab-010e-46fc-bb90-f3c6106fd96a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 420
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_04dfdcf0-a129-46ae-9f6a-fa9b9b57ef82"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-e1d2cf90-fb72-400d-90eb-ef3690a9d289

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e1d2cf90-fb72-400d-90eb-ef3690a9d289
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-d5a0ce0ca362","subject":"Error contract","message":"Hi"}

--- response: 201 in 9 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-e1d2cf90-fb72-400d-90eb-ef3690a9d289
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
Location: /v1/conversations/cnv_bfc2776b-387b-4312-9337-11fd7835b303
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_bfc2776b-387b-4312-9337-11fd7835b303","subject":"Error contract","status":"open","region":"eu","participants":["qa-58d941141835","qa-d5a0ce0ca362"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-02T09:38:36.895355727Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-34673ffe-1ca0-4040-9c66-336a6b3dcc49

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-34673ffe-1ca0-4040-9c66-336a6b3dcc49
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 14 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-34673ffe-1ca0-4040-9c66-336a6b3dcc49
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

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/conversations","correlationId":"qa-34673ffe-1ca0-4040-9c66-336a6b3dcc49"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-eb2f835c-be1f-45c8-8669-4b56c6f634b1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eb2f835c-be1f-45c8-8669-4b56c6f634b1
Content-Type: application/json

--- request body ---
{"handle":"qa-d5a0ce0ca362","password":"****"}

--- response: 200 in 23 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-eb2f835c-be1f-45c8-8669-4b56c6f634b1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 408
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d516b94b-e648-43b3-aaff-1dd37b569f51"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-16236c3f-64ef-423f-8206-98c8611469f4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-16236c3f-64ef-423f-8206-98c8611469f4
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-16236c3f-64ef-423f-8206-98c8611469f4
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
correlation: qa-70d17e6d-5029-45dd-8784-71e4f970ab96

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-70d17e6d-5029-45dd-8784-71e4f970ab96
Content-Type: application/json

--- request body ---
{"handle":"qa-d5a0ce0ca362","password":"****"}

--- response: 401 in 12 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-70d17e6d-5029-45dd-8784-71e4f970ab96
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 404
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-70d17e6d-5029-45dd-8784-71e4f970ab96"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-30942461-fb77-4f72-8d2f-1de90f780c13

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-30942461-fb77-4f72-8d2f-1de90f780c13
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-30942461-fb77-4f72-8d2f-1de90f780c13
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
correlation: qa-98ef81a8-3212-4885-8724-2fa268f0b7fd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-98ef81a8-3212-4885-8724-2fa268f0b7fd
Content-Type: application/json

--- request body ---
{"handle":"qa-58d941141835","password":"****"}

--- response: 401 in 23 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-98ef81a8-3212-4885-8724-2fa268f0b7fd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 399
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-98ef81a8-3212-4885-8724-2fa268f0b7fd"}
```
