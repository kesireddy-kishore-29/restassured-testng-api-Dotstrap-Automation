# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/accounts, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[3]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 48 | `qa-1cdad634-319a-458f-ad6e-fe34cd553b22` |
| 2 | `POST /v1/accounts` | 201 | 36 | `qa-8ac92133-ea50-4720-9bde-d77bda2a6473` |
| 3 | `POST /v1/auth/token` | 200 | 32 | `qa-8a34269c-7c3d-45f1-bbd2-e45185743c8e` |
| 4 | `POST /v1/conversations` | 201 | 10 | `qa-84abe3f7-19ab-4ff3-a838-146b5f48c710` |
| 5 | `POST /v1/accounts` | 400 | 20 | `qa-6e11a8a7-4676-4a6e-864f-688991dd6e6c` |
| 6 | `POST /v1/auth/token` | 200 | 34 | `qa-3063181f-907f-448d-9b60-8a29387f00c8` |
| 7 | `DELETE /v1/accounts/me` | 204 | 34 | `qa-9985d60e-8b47-4fea-bf77-824b06b7b604` |
| 8 | `POST /v1/auth/token` | 401 | 66 | `qa-3364b84a-c5fb-4749-807f-053f30cb10b9` |
| 9 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-9402d6d5-54e1-453b-b668-a91a6d05b757` |
| 10 | `POST /v1/auth/token` | 401 | 52 | `qa-857b775d-4b93-46c2-9c1f-fed221b10b84` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-1cdad634-319a-458f-ad6e-fe34cd553b22

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1cdad634-319a-458f-ad6e-fe34cd553b22
Content-Type: application/json

--- request body ---
{"handle":"qa-3ea4d169a79b","displayName":"QA 3ea4d169a79b","password":"****","region":"eu"}

--- response: 201 in 48 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-1cdad634-319a-458f-ad6e-fe34cd553b22
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
Location: /v1/accounts/qa-3ea4d169a79b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_835c0c50-70e1-4831-a250-d9800bc4b75f","handle":"qa-3ea4d169a79b","displayName":"QA 3ea4d169a79b","region":"eu","role":"user","createdAt":"2026-11-28T10:37:22.656624177Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-8ac92133-ea50-4720-9bde-d77bda2a6473

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ac92133-ea50-4720-9bde-d77bda2a6473
Content-Type: application/json

--- request body ---
{"handle":"qa-0e172f00eb78","displayName":"QA 0e172f00eb78","password":"****","region":"eu"}

--- response: 201 in 36 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-8ac92133-ea50-4720-9bde-d77bda2a6473
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 549
RateLimit-Reset: 9
Location: /v1/accounts/qa-0e172f00eb78
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e7896258-4600-4a7d-b019-f2676088a217","handle":"qa-0e172f00eb78","displayName":"QA 0e172f00eb78","region":"eu","role":"user","createdAt":"2026-11-28T10:37:22.725346586Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-8a34269c-7c3d-45f1-bbd2-e45185743c8e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8a34269c-7c3d-45f1-bbd2-e45185743c8e
Content-Type: application/json

--- request body ---
{"handle":"qa-3ea4d169a79b","password":"****"}

--- response: 200 in 32 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-8a34269c-7c3d-45f1-bbd2-e45185743c8e
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_835c0c50-70e1-4831-a250-d9800bc4b75f"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-84abe3f7-19ab-4ff3-a838-146b5f48c710

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-84abe3f7-19ab-4ff3-a838-146b5f48c710
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-0e172f00eb78","subject":"Error contract","message":"Hi"}

--- response: 201 in 10 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-84abe3f7-19ab-4ff3-a838-146b5f48c710
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
Location: /v1/conversations/cnv_ffe2981e-cefa-4341-bb30-b15d23985622
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_ffe2981e-cefa-4341-bb30-b15d23985622","subject":"Error contract","status":"open","region":"eu","participants":["qa-3ea4d169a79b","qa-0e172f00eb78"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-28T10:37:22.791923791Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-6e11a8a7-4676-4a6e-864f-688991dd6e6c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6e11a8a7-4676-4a6e-864f-688991dd6e6c
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 20 ms ---
Date: Sat, 28 Nov 2026 10:37:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6e11a8a7-4676-4a6e-864f-688991dd6e6c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 532
RateLimit-Reset: 9
Content-Length: 253

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/accounts","correlationId":"qa-6e11a8a7-4676-4a6e-864f-688991dd6e6c"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-3063181f-907f-448d-9b60-8a29387f00c8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3063181f-907f-448d-9b60-8a29387f00c8
Content-Type: application/json

--- request body ---
{"handle":"qa-0e172f00eb78","password":"****"}

--- response: 200 in 34 ms ---
Date: Sat, 28 Nov 2026 10:37:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-3063181f-907f-448d-9b60-8a29387f00c8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 523
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e7896258-4600-4a7d-b019-f2676088a217"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9985d60e-8b47-4fea-bf77-824b06b7b604

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9985d60e-8b47-4fea-bf77-824b06b7b604
Content-Type: application/json

--- response: 204 in 34 ms ---
Date: Sat, 28 Nov 2026 10:37:23 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9985d60e-8b47-4fea-bf77-824b06b7b604
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
correlation: qa-3364b84a-c5fb-4749-807f-053f30cb10b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3364b84a-c5fb-4749-807f-053f30cb10b9
Content-Type: application/json

--- request body ---
{"handle":"qa-0e172f00eb78","password":"****"}

--- response: 401 in 66 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3364b84a-c5fb-4749-807f-053f30cb10b9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 501
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3364b84a-c5fb-4749-807f-053f30cb10b9"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9402d6d5-54e1-453b-b668-a91a6d05b757

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9402d6d5-54e1-453b-b668-a91a6d05b757
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9402d6d5-54e1-453b-b668-a91a6d05b757
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
correlation: qa-857b775d-4b93-46c2-9c1f-fed221b10b84

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-857b775d-4b93-46c2-9c1f-fed221b10b84
Content-Type: application/json

--- request body ---
{"handle":"qa-3ea4d169a79b","password":"****"}

--- response: 401 in 52 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-857b775d-4b93-46c2-9c1f-fed221b10b84
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 485
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-857b775d-4b93-46c2-9c1f-fed221b10b84"}
```
