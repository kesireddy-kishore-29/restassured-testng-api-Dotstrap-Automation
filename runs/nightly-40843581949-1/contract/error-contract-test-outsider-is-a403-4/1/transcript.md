# Transcript: Every conversation operation answers an outsider with a 403 problem [POST /v1/conversations/{id}/close]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[4]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 56 | `qa-c0ced769-2836-4038-bead-bf53e7f22950` |
| 2 | `POST /v1/accounts` | 201 | 32 | `qa-4fe9bc8f-9101-4672-90e5-7b371df9c8ef` |
| 3 | `POST /v1/accounts` | 201 | 48 | `qa-2462feee-49bc-4a70-83b2-acd96120cbe7` |
| 4 | `POST /v1/auth/token` | 200 | 44 | `qa-55eb6b6c-69ac-455f-a7ab-3cf8641cfd04` |
| 5 | `POST /v1/conversations` | 201 | 32 | `qa-92b4337f-2ef1-4a10-891f-5e9402572717` |
| 6 | `POST /v1/auth/token` | 200 | 47 | `qa-4891af60-f1f9-4f02-af4e-0d4abecef3a0` |
| 7 | `POST /v1/conversations/{id}/close` | 403 | 18 | `qa-1c92a9f1-5a50-4745-8551-907777e33976` |
| 8 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-c4a4fa7b-dff1-4a77-a66c-9ded4931ee59` |
| 9 | `POST /v1/auth/token` | 401 | 15 | `qa-15d28fa6-3324-468b-84cd-5947629e73dc` |
| 10 | `POST /v1/auth/token` | 200 | 20 | `qa-31fe1cbe-0490-47f1-a44b-d235ca72c287` |
| 11 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-97985318-8da7-4f83-9a40-32f5337eb833` |
| 12 | `POST /v1/auth/token` | 401 | 38 | `qa-4a5573a1-df93-42cb-9ea4-b00949c169fa` |
| 13 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-d40079c2-36c4-4255-a324-fe0a741e482b` |
| 14 | `POST /v1/auth/token` | 401 | 22 | `qa-ccf86296-543c-4620-aeec-b53545adf9e0` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c0ced769-2836-4038-bead-bf53e7f22950

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c0ced769-2836-4038-bead-bf53e7f22950
Content-Type: application/json

--- request body ---
{"handle":"qa-d514d303a8a9","displayName":"QA d514d303a8a9","password":"****","region":"eu"}

--- response: 201 in 56 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-c0ced769-2836-4038-bead-bf53e7f22950
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 498
RateLimit-Reset: 8
Location: /v1/accounts/qa-d514d303a8a9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a44f329e-a8ed-4f83-8b14-5c763b8c2905","handle":"qa-d514d303a8a9","displayName":"QA d514d303a8a9","region":"eu","role":"user","createdAt":"2026-10-29T08:38:59.768366431Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-4fe9bc8f-9101-4672-90e5-7b371df9c8ef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4fe9bc8f-9101-4672-90e5-7b371df9c8ef
Content-Type: application/json

--- request body ---
{"handle":"qa-36c60853f21c","displayName":"QA 36c60853f21c","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-4fe9bc8f-9101-4672-90e5-7b371df9c8ef
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 488
RateLimit-Reset: 8
Location: /v1/accounts/qa-36c60853f21c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ac13d22a-52cf-4182-892a-fffade9f5ca3","handle":"qa-36c60853f21c","displayName":"QA 36c60853f21c","region":"eu","role":"user","createdAt":"2026-10-29T08:38:59.825717478Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-2462feee-49bc-4a70-83b2-acd96120cbe7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2462feee-49bc-4a70-83b2-acd96120cbe7
Content-Type: application/json

--- request body ---
{"handle":"qa-ad5634f94444","displayName":"QA ad5634f94444","password":"****","region":"eu"}

--- response: 201 in 48 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-2462feee-49bc-4a70-83b2-acd96120cbe7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 483
RateLimit-Reset: 8
Location: /v1/accounts/qa-ad5634f94444
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0954616b-e84d-40df-b416-4670c9fd7388","handle":"qa-ad5634f94444","displayName":"QA ad5634f94444","region":"eu","role":"user","createdAt":"2026-10-29T08:38:59.899962819Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-55eb6b6c-69ac-455f-a7ab-3cf8641cfd04

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-55eb6b6c-69ac-455f-a7ab-3cf8641cfd04
Content-Type: application/json

--- request body ---
{"handle":"qa-d514d303a8a9","password":"****"}

--- response: 200 in 44 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-55eb6b6c-69ac-455f-a7ab-3cf8641cfd04
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 474
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a44f329e-a8ed-4f83-8b14-5c763b8c2905"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-92b4337f-2ef1-4a10-891f-5e9402572717

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-92b4337f-2ef1-4a10-891f-5e9402572717
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-36c60853f21c","subject":"Error contract","message":"Hi"}

--- response: 201 in 32 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-92b4337f-2ef1-4a10-891f-5e9402572717
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
Location: /v1/conversations/cnv_712eb5dc-6de3-41c0-ac0a-411904373d1f
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_712eb5dc-6de3-41c0-ac0a-411904373d1f","subject":"Error contract","status":"open","region":"eu","participants":["qa-d514d303a8a9","qa-36c60853f21c"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-29T08:39:00.023883375Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-4891af60-f1f9-4f02-af4e-0d4abecef3a0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4891af60-f1f9-4f02-af4e-0d4abecef3a0
Content-Type: application/json

--- request body ---
{"handle":"qa-ad5634f94444","password":"****"}

--- response: 200 in 47 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-4891af60-f1f9-4f02-af4e-0d4abecef3a0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 469
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0954616b-e84d-40df-b416-4670c9fd7388"}
```

## 7. POST /v1/conversations/{id}/close

```text
#7 POST http://localhost:7070/v1/conversations/cnv_712eb5dc-6de3-41c0-ac0a-411904373d1f/close
correlation: qa-1c92a9f1-5a50-4745-8551-907777e33976

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1c92a9f1-5a50-4745-8551-907777e33976
Content-Type: application/json

--- response: 403 in 18 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1c92a9f1-5a50-4745-8551-907777e33976
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
Content-Length: 291

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_712eb5dc-6de3-41c0-ac0a-411904373d1f/close","correlationId":"qa-1c92a9f1-5a50-4745-8551-907777e33976"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c4a4fa7b-dff1-4a77-a66c-9ded4931ee59

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c4a4fa7b-dff1-4a77-a66c-9ded4931ee59
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c4a4fa7b-dff1-4a77-a66c-9ded4931ee59
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
correlation: qa-15d28fa6-3324-468b-84cd-5947629e73dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-15d28fa6-3324-468b-84cd-5947629e73dc
Content-Type: application/json

--- request body ---
{"handle":"qa-ad5634f94444","password":"****"}

--- response: 401 in 15 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-15d28fa6-3324-468b-84cd-5947629e73dc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 451
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-15d28fa6-3324-468b-84cd-5947629e73dc"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-31fe1cbe-0490-47f1-a44b-d235ca72c287

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-31fe1cbe-0490-47f1-a44b-d235ca72c287
Content-Type: application/json

--- request body ---
{"handle":"qa-36c60853f21c","password":"****"}

--- response: 200 in 20 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-31fe1cbe-0490-47f1-a44b-d235ca72c287
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 446
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ac13d22a-52cf-4182-892a-fffade9f5ca3"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-97985318-8da7-4f83-9a40-32f5337eb833

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-97985318-8da7-4f83-9a40-32f5337eb833
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-97985318-8da7-4f83-9a40-32f5337eb833
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
correlation: qa-4a5573a1-df93-42cb-9ea4-b00949c169fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4a5573a1-df93-42cb-9ea4-b00949c169fa
Content-Type: application/json

--- request body ---
{"handle":"qa-36c60853f21c","password":"****"}

--- response: 401 in 38 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4a5573a1-df93-42cb-9ea4-b00949c169fa
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4a5573a1-df93-42cb-9ea4-b00949c169fa"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d40079c2-36c4-4255-a324-fe0a741e482b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d40079c2-36c4-4255-a324-fe0a741e482b
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d40079c2-36c4-4255-a324-fe0a741e482b
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

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-ccf86296-543c-4620-aeec-b53545adf9e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ccf86296-543c-4620-aeec-b53545adf9e0
Content-Type: application/json

--- request body ---
{"handle":"qa-d514d303a8a9","password":"****"}

--- response: 401 in 22 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ccf86296-543c-4620-aeec-b53545adf9e0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 423
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ccf86296-543c-4620-aeec-b53545adf9e0"}
```
