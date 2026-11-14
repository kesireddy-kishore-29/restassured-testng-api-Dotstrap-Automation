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
| 1 | `POST /v1/accounts` | 201 | 44 | `qa-d594c762-2f0f-49a2-98ac-d41c16dd0864` |
| 2 | `POST /v1/accounts` | 201 | 44 | `qa-d2ae1674-37cb-47d0-a415-795712b1e907` |
| 3 | `POST /v1/auth/token` | 200 | 27 | `qa-93228708-9cde-413d-af7a-526c50f5350b` |
| 4 | `POST /v1/conversations` | 201 | 4 | `qa-b31423a7-e437-4ed4-8a2b-a1eade7c4b22` |
| 5 | `POST /v1/auth/token` | 400 | 25 | `qa-47e9b2c9-0ef5-4889-9bc6-6b8a67e5ba0b` |
| 6 | `POST /v1/auth/token` | 200 | 35 | `qa-750b1735-57fe-407b-be9e-722789202b98` |
| 7 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-9b6c2dc2-490a-4e7a-becf-23ebf4fe7232` |
| 8 | `POST /v1/auth/token` | 401 | 16 | `qa-4fd64f62-5e4a-4391-9499-7efe2e60082a` |
| 9 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-a2614466-8286-4d44-86ab-3ea7d9186a25` |
| 10 | `POST /v1/auth/token` | 401 | 25 | `qa-67a054ad-5e53-465c-acc5-7af822246cd1` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d594c762-2f0f-49a2-98ac-d41c16dd0864

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d594c762-2f0f-49a2-98ac-d41c16dd0864
Content-Type: application/json

--- request body ---
{"handle":"qa-afc01ae09319","displayName":"QA afc01ae09319","password":"****","region":"eu"}

--- response: 201 in 44 ms ---
Date: Sat, 14 Nov 2026 09:05:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-d594c762-2f0f-49a2-98ac-d41c16dd0864
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 575
RateLimit-Reset: 10
Location: /v1/accounts/qa-afc01ae09319
X-Served-Region: eu
Content-Length: 181

{"id":"acc_841b4803-ce2e-495e-816e-bb51bb0fc186","handle":"qa-afc01ae09319","displayName":"QA afc01ae09319","region":"eu","role":"user","createdAt":"2026-11-14T09:05:09.992055465Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-d2ae1674-37cb-47d0-a415-795712b1e907

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d2ae1674-37cb-47d0-a415-795712b1e907
Content-Type: application/json

--- request body ---
{"handle":"qa-161f425587e8","displayName":"QA 161f425587e8","password":"****","region":"eu"}

--- response: 201 in 44 ms ---
Date: Sat, 14 Nov 2026 09:05:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-d2ae1674-37cb-47d0-a415-795712b1e907
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 563
RateLimit-Reset: 9
Location: /v1/accounts/qa-161f425587e8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_173a3682-d6c4-4513-8d99-dfef8991100c","handle":"qa-161f425587e8","displayName":"QA 161f425587e8","region":"eu","role":"user","createdAt":"2026-11-14T09:05:10.044558563Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-93228708-9cde-413d-af7a-526c50f5350b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-93228708-9cde-413d-af7a-526c50f5350b
Content-Type: application/json

--- request body ---
{"handle":"qa-afc01ae09319","password":"****"}

--- response: 200 in 27 ms ---
Date: Sat, 14 Nov 2026 09:05:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-93228708-9cde-413d-af7a-526c50f5350b
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_841b4803-ce2e-495e-816e-bb51bb0fc186"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-b31423a7-e437-4ed4-8a2b-a1eade7c4b22

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b31423a7-e437-4ed4-8a2b-a1eade7c4b22
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-161f425587e8","subject":"Error contract","message":"Hi"}

--- response: 201 in 4 ms ---
Date: Sat, 14 Nov 2026 09:05:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-b31423a7-e437-4ed4-8a2b-a1eade7c4b22
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
Location: /v1/conversations/cnv_fbed8ea7-14e7-4d2f-b208-ffff2cbeca22
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_fbed8ea7-14e7-4d2f-b208-ffff2cbeca22","subject":"Error contract","status":"open","region":"eu","participants":["qa-afc01ae09319","qa-161f425587e8"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-14T09:05:10.121358641Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-47e9b2c9-0ef5-4889-9bc6-6b8a67e5ba0b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-47e9b2c9-0ef5-4889-9bc6-6b8a67e5ba0b
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 25 ms ---
Date: Sat, 14 Nov 2026 09:05:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-47e9b2c9-0ef5-4889-9bc6-6b8a67e5ba0b
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

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/auth/token","correlationId":"qa-47e9b2c9-0ef5-4889-9bc6-6b8a67e5ba0b"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-750b1735-57fe-407b-be9e-722789202b98

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-750b1735-57fe-407b-be9e-722789202b98
Content-Type: application/json

--- request body ---
{"handle":"qa-161f425587e8","password":"****"}

--- response: 200 in 35 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-750b1735-57fe-407b-be9e-722789202b98
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_173a3682-d6c4-4513-8d99-dfef8991100c"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9b6c2dc2-490a-4e7a-becf-23ebf4fe7232

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b6c2dc2-490a-4e7a-becf-23ebf4fe7232
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9b6c2dc2-490a-4e7a-becf-23ebf4fe7232
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
correlation: qa-4fd64f62-5e4a-4391-9499-7efe2e60082a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4fd64f62-5e4a-4391-9499-7efe2e60082a
Content-Type: application/json

--- request body ---
{"handle":"qa-161f425587e8","password":"****"}

--- response: 401 in 16 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4fd64f62-5e4a-4391-9499-7efe2e60082a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 511
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4fd64f62-5e4a-4391-9499-7efe2e60082a"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a2614466-8286-4d44-86ab-3ea7d9186a25

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a2614466-8286-4d44-86ab-3ea7d9186a25
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a2614466-8286-4d44-86ab-3ea7d9186a25
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
correlation: qa-67a054ad-5e53-465c-acc5-7af822246cd1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-67a054ad-5e53-465c-acc5-7af822246cd1
Content-Type: application/json

--- request body ---
{"handle":"qa-afc01ae09319","password":"****"}

--- response: 401 in 25 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-67a054ad-5e53-465c-acc5-7af822246cd1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 500
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-67a054ad-5e53-465c-acc5-7af822246cd1"}
```
