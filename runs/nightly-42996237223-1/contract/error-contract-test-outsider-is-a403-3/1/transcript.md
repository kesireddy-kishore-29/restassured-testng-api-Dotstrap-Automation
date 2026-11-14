# Transcript: Every conversation operation answers an outsider with a 403 problem [POST /v1/conversations/{id}/read]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[3]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 103 | `qa-a8a594a3-028b-4611-8307-2f467b4137a5` |
| 2 | `POST /v1/accounts` | 201 | 51 | `qa-17ae9dd4-e46c-4da7-98c4-ab54df98236c` |
| 3 | `POST /v1/accounts` | 201 | 40 | `qa-70083c8b-a255-4ac8-bc1d-ca23a6b75a39` |
| 4 | `POST /v1/auth/token` | 200 | 28 | `qa-e3edee8f-f933-46bc-b365-54a9fb2dd31d` |
| 5 | `POST /v1/conversations` | 201 | 21 | `qa-47a80adc-070b-4674-8b67-8c145805f32b` |
| 6 | `POST /v1/auth/token` | 200 | 22 | `qa-3cb9a21b-2cae-4d98-a6b1-a1b1787f97ca` |
| 7 | `POST /v1/conversations/{id}/read` | 403 | 18 | `qa-7a994474-aee6-496e-a194-c3a2d2806f22` |
| 8 | `DELETE /v1/accounts/me` | 204 | 34 | `qa-a63882b2-f32b-4ddb-93e8-11dbb6434344` |
| 9 | `POST /v1/auth/token` | 401 | 36 | `qa-839e117c-f55e-4ca7-81fa-d5aa3d22657e` |
| 10 | `POST /v1/auth/token` | 200 | 41 | `qa-7cae9c8b-2a10-4d1f-9938-8c97f92f7b18` |
| 11 | `DELETE /v1/accounts/me` | 204 | 39 | `qa-03c46a82-3c6d-432b-adb5-06cf052dfeb1` |
| 12 | `POST /v1/auth/token` | 401 | 32 | `qa-93d8c873-05b9-463d-85e6-00f8b9e23732` |
| 13 | `DELETE /v1/accounts/me` | 204 | 34 | `qa-da50ce39-8c0c-4e48-ba0c-f3f940b24e59` |
| 14 | `POST /v1/auth/token` | 401 | 24 | `qa-61070141-c137-47e1-8881-42967f5ac7ca` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a8a594a3-028b-4611-8307-2f467b4137a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a8a594a3-028b-4611-8307-2f467b4137a5
Content-Type: application/json

--- request body ---
{"handle":"qa-d23bffe174c9","displayName":"QA d23bffe174c9","password":"****","region":"eu"}

--- response: 201 in 103 ms ---
Date: Wed, 11 Nov 2026 09:34:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-a8a594a3-028b-4611-8307-2f467b4137a5
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
Location: /v1/accounts/qa-d23bffe174c9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ab1540f1-0370-44e7-8c6d-7653fda15dc7","handle":"qa-d23bffe174c9","displayName":"QA d23bffe174c9","region":"eu","role":"user","createdAt":"2026-11-11T09:34:36.189584976Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-17ae9dd4-e46c-4da7-98c4-ab54df98236c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-17ae9dd4-e46c-4da7-98c4-ab54df98236c
Content-Type: application/json

--- request body ---
{"handle":"qa-87e8e6b0e252","displayName":"QA 87e8e6b0e252","password":"****","region":"eu"}

--- response: 201 in 51 ms ---
Date: Wed, 11 Nov 2026 09:34:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-17ae9dd4-e46c-4da7-98c4-ab54df98236c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 540
RateLimit-Reset: 9
Location: /v1/accounts/qa-87e8e6b0e252
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2e5e2cf1-bc97-45cf-8392-ea6189a5dc1a","handle":"qa-87e8e6b0e252","displayName":"QA 87e8e6b0e252","region":"eu","role":"user","createdAt":"2026-11-11T09:34:36.243978962Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-70083c8b-a255-4ac8-bc1d-ca23a6b75a39

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-70083c8b-a255-4ac8-bc1d-ca23a6b75a39
Content-Type: application/json

--- request body ---
{"handle":"qa-e2430ab63351","displayName":"QA e2430ab63351","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Wed, 11 Nov 2026 09:34:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-70083c8b-a255-4ac8-bc1d-ca23a6b75a39
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 535
RateLimit-Reset: 9
Location: /v1/accounts/qa-e2430ab63351
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3fd3d075-6401-4da8-85e9-5b3bb3959d72","handle":"qa-e2430ab63351","displayName":"QA e2430ab63351","region":"eu","role":"user","createdAt":"2026-11-11T09:34:36.316247399Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-e3edee8f-f933-46bc-b365-54a9fb2dd31d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e3edee8f-f933-46bc-b365-54a9fb2dd31d
Content-Type: application/json

--- request body ---
{"handle":"qa-d23bffe174c9","password":"****"}

--- response: 200 in 28 ms ---
Date: Wed, 11 Nov 2026 09:34:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-e3edee8f-f933-46bc-b365-54a9fb2dd31d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 529
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ab1540f1-0370-44e7-8c6d-7653fda15dc7"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-47a80adc-070b-4674-8b67-8c145805f32b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-47a80adc-070b-4674-8b67-8c145805f32b
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-87e8e6b0e252","subject":"Error contract","message":"Hi"}

--- response: 201 in 21 ms ---
Date: Wed, 11 Nov 2026 09:34:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-47a80adc-070b-4674-8b67-8c145805f32b
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
Location: /v1/conversations/cnv_f2eacb38-bc22-4e53-9a5b-538719712d73
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_f2eacb38-bc22-4e53-9a5b-538719712d73","subject":"Error contract","status":"open","region":"eu","participants":["qa-d23bffe174c9","qa-87e8e6b0e252"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-11T09:34:36.401136427Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-3cb9a21b-2cae-4d98-a6b1-a1b1787f97ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3cb9a21b-2cae-4d98-a6b1-a1b1787f97ca
Content-Type: application/json

--- request body ---
{"handle":"qa-e2430ab63351","password":"****"}

--- response: 200 in 22 ms ---
Date: Wed, 11 Nov 2026 09:34:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-3cb9a21b-2cae-4d98-a6b1-a1b1787f97ca
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 526
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3fd3d075-6401-4da8-85e9-5b3bb3959d72"}
```

## 7. POST /v1/conversations/{id}/read

```text
#7 POST http://localhost:7070/v1/conversations/cnv_f2eacb38-bc22-4e53-9a5b-538719712d73/read
correlation: qa-7a994474-aee6-496e-a194-c3a2d2806f22

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7a994474-aee6-496e-a194-c3a2d2806f22
Content-Type: application/json

--- response: 403 in 18 ms ---
Date: Wed, 11 Nov 2026 09:34:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7a994474-aee6-496e-a194-c3a2d2806f22
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
Content-Length: 290

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_f2eacb38-bc22-4e53-9a5b-538719712d73/read","correlationId":"qa-7a994474-aee6-496e-a194-c3a2d2806f22"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a63882b2-f32b-4ddb-93e8-11dbb6434344

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a63882b2-f32b-4ddb-93e8-11dbb6434344
Content-Type: application/json

--- response: 204 in 34 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a63882b2-f32b-4ddb-93e8-11dbb6434344
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

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-839e117c-f55e-4ca7-81fa-d5aa3d22657e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-839e117c-f55e-4ca7-81fa-d5aa3d22657e
Content-Type: application/json

--- request body ---
{"handle":"qa-e2430ab63351","password":"****"}

--- response: 401 in 36 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-839e117c-f55e-4ca7-81fa-d5aa3d22657e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 515
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-839e117c-f55e-4ca7-81fa-d5aa3d22657e"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-7cae9c8b-2a10-4d1f-9938-8c97f92f7b18

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7cae9c8b-2a10-4d1f-9938-8c97f92f7b18
Content-Type: application/json

--- request body ---
{"handle":"qa-87e8e6b0e252","password":"****"}

--- response: 200 in 41 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-7cae9c8b-2a10-4d1f-9938-8c97f92f7b18
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 507
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2e5e2cf1-bc97-45cf-8392-ea6189a5dc1a"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-03c46a82-3c6d-432b-adb5-06cf052dfeb1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-03c46a82-3c6d-432b-adb5-06cf052dfeb1
Content-Type: application/json

--- response: 204 in 39 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-03c46a82-3c6d-432b-adb5-06cf052dfeb1
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

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-93d8c873-05b9-463d-85e6-00f8b9e23732

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-93d8c873-05b9-463d-85e6-00f8b9e23732
Content-Type: application/json

--- request body ---
{"handle":"qa-87e8e6b0e252","password":"****"}

--- response: 401 in 32 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-93d8c873-05b9-463d-85e6-00f8b9e23732
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 489
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-93d8c873-05b9-463d-85e6-00f8b9e23732"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-da50ce39-8c0c-4e48-ba0c-f3f940b24e59

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-da50ce39-8c0c-4e48-ba0c-f3f940b24e59
Content-Type: application/json

--- response: 204 in 34 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-da50ce39-8c0c-4e48-ba0c-f3f940b24e59
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

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-61070141-c137-47e1-8881-42967f5ac7ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-61070141-c137-47e1-8881-42967f5ac7ca
Content-Type: application/json

--- request body ---
{"handle":"qa-d23bffe174c9","password":"****"}

--- response: 401 in 24 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-61070141-c137-47e1-8881-42967f5ac7ca
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 467
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-61070141-c137-47e1-8881-42967f5ac7ca"}
```
