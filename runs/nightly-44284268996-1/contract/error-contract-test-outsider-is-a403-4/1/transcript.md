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
| 1 | `POST /v1/accounts` | 201 | 30 | `qa-fd415ae1-1ad5-4d45-975d-139357ed68cd` |
| 2 | `POST /v1/accounts` | 201 | 46 | `qa-7f9373ef-6344-4957-940f-33c13ee5b840` |
| 3 | `POST /v1/accounts` | 201 | 46 | `qa-090dc021-476c-4728-ba5a-c6b67805b8ae` |
| 4 | `POST /v1/auth/token` | 200 | 16 | `qa-5fd14d2a-a42d-493b-b793-3623da6acf15` |
| 5 | `POST /v1/conversations` | 201 | 8 | `qa-5f30cab5-1ecf-4e9b-9158-f3c895a0bd97` |
| 6 | `POST /v1/auth/token` | 200 | 16 | `qa-b0ad8182-4bcc-4228-bae5-461291097b9f` |
| 7 | `POST /v1/conversations/{id}/close` | 403 | 4 | `qa-79979b82-4a34-4b21-af6c-36d9da9d9a7b` |
| 8 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-edbd86af-ba6c-4dc8-b270-93446b9a5d18` |
| 9 | `POST /v1/auth/token` | 401 | 13 | `qa-2defb530-b66b-4301-9e2b-23cbed6c0ab8` |
| 10 | `POST /v1/auth/token` | 200 | 25 | `qa-33098920-274d-48ed-92cb-0c96e1b7541f` |
| 11 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-aeec2ddb-08ff-4e79-ab18-8da624460fcb` |
| 12 | `POST /v1/auth/token` | 401 | 17 | `qa-18a178e8-6b8c-4644-af21-29145e0a9d80` |
| 13 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-ea01ed78-4977-4c39-bffe-d064f8eb08a9` |
| 14 | `POST /v1/auth/token` | 401 | 12 | `qa-bb411af4-c24d-47aa-9d56-21d1c5274180` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-fd415ae1-1ad5-4d45-975d-139357ed68cd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd415ae1-1ad5-4d45-975d-139357ed68cd
Content-Type: application/json

--- request body ---
{"handle":"qa-db86dd6cf112","displayName":"QA db86dd6cf112","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-fd415ae1-1ad5-4d45-975d-139357ed68cd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 457
RateLimit-Reset: 8
Location: /v1/accounts/qa-db86dd6cf112
X-Served-Region: eu
Content-Length: 181

{"id":"acc_13273998-7ea3-4464-b324-f47eca45dd65","handle":"qa-db86dd6cf112","displayName":"QA db86dd6cf112","region":"eu","role":"user","createdAt":"2026-11-18T10:19:51.788783772Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-7f9373ef-6344-4957-940f-33c13ee5b840

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7f9373ef-6344-4957-940f-33c13ee5b840
Content-Type: application/json

--- request body ---
{"handle":"qa-426f20347bbe","displayName":"QA 426f20347bbe","password":"****","region":"eu"}

--- response: 201 in 46 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-7f9373ef-6344-4957-940f-33c13ee5b840
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 449
RateLimit-Reset: 8
Location: /v1/accounts/qa-426f20347bbe
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0d471713-552e-45c9-a428-424290bdd153","handle":"qa-426f20347bbe","displayName":"QA 426f20347bbe","region":"eu","role":"user","createdAt":"2026-11-18T10:19:51.862671006Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-090dc021-476c-4728-ba5a-c6b67805b8ae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-090dc021-476c-4728-ba5a-c6b67805b8ae
Content-Type: application/json

--- request body ---
{"handle":"qa-c3df80a0198f","displayName":"QA c3df80a0198f","password":"****","region":"eu"}

--- response: 201 in 46 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-090dc021-476c-4728-ba5a-c6b67805b8ae
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
Location: /v1/accounts/qa-c3df80a0198f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_09c4bb6a-d1e7-494b-b3ef-0188bd97ec61","handle":"qa-c3df80a0198f","displayName":"QA c3df80a0198f","region":"eu","role":"user","createdAt":"2026-11-18T10:19:51.915967002Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-5fd14d2a-a42d-493b-b793-3623da6acf15

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5fd14d2a-a42d-493b-b793-3623da6acf15
Content-Type: application/json

--- request body ---
{"handle":"qa-db86dd6cf112","password":"****"}

--- response: 200 in 16 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-5fd14d2a-a42d-493b-b793-3623da6acf15
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 440
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_13273998-7ea3-4464-b324-f47eca45dd65"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-5f30cab5-1ecf-4e9b-9158-f3c895a0bd97

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5f30cab5-1ecf-4e9b-9158-f3c895a0bd97
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-426f20347bbe","subject":"Error contract","message":"Hi"}

--- response: 201 in 8 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-5f30cab5-1ecf-4e9b-9158-f3c895a0bd97
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
Location: /v1/conversations/cnv_88e47361-d771-4e65-a0ce-a514f9d8f74c
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_88e47361-d771-4e65-a0ce-a514f9d8f74c","subject":"Error contract","status":"open","region":"eu","participants":["qa-db86dd6cf112","qa-426f20347bbe"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-18T10:19:52.001622707Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-b0ad8182-4bcc-4228-bae5-461291097b9f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b0ad8182-4bcc-4228-bae5-461291097b9f
Content-Type: application/json

--- request body ---
{"handle":"qa-c3df80a0198f","password":"****"}

--- response: 200 in 16 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-b0ad8182-4bcc-4228-bae5-461291097b9f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 433
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_09c4bb6a-d1e7-494b-b3ef-0188bd97ec61"}
```

## 7. POST /v1/conversations/{id}/close

```text
#7 POST http://localhost:7070/v1/conversations/cnv_88e47361-d771-4e65-a0ce-a514f9d8f74c/close
correlation: qa-79979b82-4a34-4b21-af6c-36d9da9d9a7b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-79979b82-4a34-4b21-af6c-36d9da9d9a7b
Content-Type: application/json

--- response: 403 in 4 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-79979b82-4a34-4b21-af6c-36d9da9d9a7b
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_88e47361-d771-4e65-a0ce-a514f9d8f74c/close","correlationId":"qa-79979b82-4a34-4b21-af6c-36d9da9d9a7b"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-edbd86af-ba6c-4dc8-b270-93446b9a5d18

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-edbd86af-ba6c-4dc8-b270-93446b9a5d18
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-edbd86af-ba6c-4dc8-b270-93446b9a5d18
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
correlation: qa-2defb530-b66b-4301-9e2b-23cbed6c0ab8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2defb530-b66b-4301-9e2b-23cbed6c0ab8
Content-Type: application/json

--- request body ---
{"handle":"qa-c3df80a0198f","password":"****"}

--- response: 401 in 13 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2defb530-b66b-4301-9e2b-23cbed6c0ab8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 411
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2defb530-b66b-4301-9e2b-23cbed6c0ab8"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-33098920-274d-48ed-92cb-0c96e1b7541f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-33098920-274d-48ed-92cb-0c96e1b7541f
Content-Type: application/json

--- request body ---
{"handle":"qa-426f20347bbe","password":"****"}

--- response: 200 in 25 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-33098920-274d-48ed-92cb-0c96e1b7541f
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0d471713-552e-45c9-a428-424290bdd153"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-aeec2ddb-08ff-4e79-ab18-8da624460fcb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aeec2ddb-08ff-4e79-ab18-8da624460fcb
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-aeec2ddb-08ff-4e79-ab18-8da624460fcb
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
correlation: qa-18a178e8-6b8c-4644-af21-29145e0a9d80

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-18a178e8-6b8c-4644-af21-29145e0a9d80
Content-Type: application/json

--- request body ---
{"handle":"qa-426f20347bbe","password":"****"}

--- response: 401 in 17 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-18a178e8-6b8c-4644-af21-29145e0a9d80
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 398
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-18a178e8-6b8c-4644-af21-29145e0a9d80"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ea01ed78-4977-4c39-bffe-d064f8eb08a9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ea01ed78-4977-4c39-bffe-d064f8eb08a9
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ea01ed78-4977-4c39-bffe-d064f8eb08a9
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
correlation: qa-bb411af4-c24d-47aa-9d56-21d1c5274180

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb411af4-c24d-47aa-9d56-21d1c5274180
Content-Type: application/json

--- request body ---
{"handle":"qa-db86dd6cf112","password":"****"}

--- response: 401 in 12 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bb411af4-c24d-47aa-9d56-21d1c5274180
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 391
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bb411af4-c24d-47aa-9d56-21d1c5274180"}
```
