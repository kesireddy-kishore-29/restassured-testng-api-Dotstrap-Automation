# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations/{id}/messages, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[12]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 49 | `qa-e78d835a-7aeb-4d98-ab5a-0b98aac73618` |
| 2 | `POST /v1/accounts` | 201 | 50 | `qa-f6b079a5-7767-4898-aab8-fc2474edbe0a` |
| 3 | `POST /v1/auth/token` | 200 | 42 | `qa-74e51acd-4a13-4368-acc6-fe761cdf02d5` |
| 4 | `POST /v1/conversations` | 201 | 10 | `qa-f316dea9-a7e4-4713-8ca4-9ad18ee3fcf3` |
| 5 | `POST /v1/conversations/{id}/messages` | 400 | 29 | `qa-2ff750ae-bbd0-474d-99c9-eabddaf63941` |
| 6 | `POST /v1/auth/token` | 200 | 30 | `qa-b4cade73-6dc7-444b-8f58-f636fb082978` |
| 7 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-5c484f07-cc82-4f02-8e2f-f08d85c5d0ad` |
| 8 | `POST /v1/auth/token` | 401 | 18 | `qa-6541a35a-4f3f-4042-a1f5-99f65b0fc7c1` |
| 9 | `DELETE /v1/accounts/me` | 204 | 41 | `qa-bd87e6bb-7630-4cbe-85ed-7931ba0bef32` |
| 10 | `POST /v1/auth/token` | 401 | 36 | `qa-9b69dd6d-b394-47d1-9d64-b644aa087cfa` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e78d835a-7aeb-4d98-ab5a-0b98aac73618

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e78d835a-7aeb-4d98-ab5a-0b98aac73618
Content-Type: application/json

--- request body ---
{"handle":"qa-c0c5478966d4","displayName":"QA c0c5478966d4","password":"****","region":"eu"}

--- response: 201 in 49 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-e78d835a-7aeb-4d98-ab5a-0b98aac73618
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 361
RateLimit-Reset: 6
Location: /v1/accounts/qa-c0c5478966d4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d8cf1c0a-70f8-4bf8-8fb2-53d7d065b152","handle":"qa-c0c5478966d4","displayName":"QA c0c5478966d4","region":"eu","role":"user","createdAt":"2026-10-23T07:41:46.745739085Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-f6b079a5-7767-4898-aab8-fc2474edbe0a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f6b079a5-7767-4898-aab8-fc2474edbe0a
Content-Type: application/json

--- request body ---
{"handle":"qa-8ff74c13b920","displayName":"QA 8ff74c13b920","password":"****","region":"eu"}

--- response: 201 in 50 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-f6b079a5-7767-4898-aab8-fc2474edbe0a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 353
RateLimit-Reset: 6
Location: /v1/accounts/qa-8ff74c13b920
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f73b3882-4ba9-4b95-8af8-ba84d295e1f3","handle":"qa-8ff74c13b920","displayName":"QA 8ff74c13b920","region":"eu","role":"user","createdAt":"2026-10-23T07:41:46.813018025Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-74e51acd-4a13-4368-acc6-fe761cdf02d5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-74e51acd-4a13-4368-acc6-fe761cdf02d5
Content-Type: application/json

--- request body ---
{"handle":"qa-c0c5478966d4","password":"****"}

--- response: 200 in 42 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-74e51acd-4a13-4368-acc6-fe761cdf02d5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 343
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d8cf1c0a-70f8-4bf8-8fb2-53d7d065b152"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-f316dea9-a7e4-4713-8ca4-9ad18ee3fcf3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f316dea9-a7e4-4713-8ca4-9ad18ee3fcf3
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-8ff74c13b920","subject":"Error contract","message":"Hi"}

--- response: 201 in 10 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-f316dea9-a7e4-4713-8ca4-9ad18ee3fcf3
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
Location: /v1/conversations/cnv_9880a4c2-c56e-49f4-afa6-881193066331
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_9880a4c2-c56e-49f4-afa6-881193066331","subject":"Error contract","status":"open","region":"eu","participants":["qa-c0c5478966d4","qa-8ff74c13b920"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-23T07:41:46.917086968Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_9880a4c2-c56e-49f4-afa6-881193066331/messages
correlation: qa-2ff750ae-bbd0-474d-99c9-eabddaf63941

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2ff750ae-bbd0-474d-99c9-eabddaf63941
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 29 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2ff750ae-bbd0-474d-99c9-eabddaf63941
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
Content-Length: 308

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/conversations/cnv_9880a4c2-c56e-49f4-afa6-881193066331/messages","correlationId":"qa-2ff750ae-bbd0-474d-99c9-eabddaf63941"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-b4cade73-6dc7-444b-8f58-f636fb082978

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b4cade73-6dc7-444b-8f58-f636fb082978
Content-Type: application/json

--- request body ---
{"handle":"qa-8ff74c13b920","password":"****"}

--- response: 200 in 30 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-b4cade73-6dc7-444b-8f58-f636fb082978
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 331
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f73b3882-4ba9-4b95-8af8-ba84d295e1f3"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5c484f07-cc82-4f02-8e2f-f08d85c5d0ad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5c484f07-cc82-4f02-8e2f-f08d85c5d0ad
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5c484f07-cc82-4f02-8e2f-f08d85c5d0ad
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
correlation: qa-6541a35a-4f3f-4042-a1f5-99f65b0fc7c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6541a35a-4f3f-4042-a1f5-99f65b0fc7c1
Content-Type: application/json

--- request body ---
{"handle":"qa-8ff74c13b920","password":"****"}

--- response: 401 in 18 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6541a35a-4f3f-4042-a1f5-99f65b0fc7c1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 322
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6541a35a-4f3f-4042-a1f5-99f65b0fc7c1"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-bd87e6bb-7630-4cbe-85ed-7931ba0bef32

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bd87e6bb-7630-4cbe-85ed-7931ba0bef32
Content-Type: application/json

--- response: 204 in 41 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-bd87e6bb-7630-4cbe-85ed-7931ba0bef32
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
correlation: qa-9b69dd6d-b394-47d1-9d64-b644aa087cfa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b69dd6d-b394-47d1-9d64-b644aa087cfa
Content-Type: application/json

--- request body ---
{"handle":"qa-c0c5478966d4","password":"****"}

--- response: 401 in 36 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9b69dd6d-b394-47d1-9d64-b644aa087cfa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 311
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9b69dd6d-b394-47d1-9d64-b644aa087cfa"}
```
