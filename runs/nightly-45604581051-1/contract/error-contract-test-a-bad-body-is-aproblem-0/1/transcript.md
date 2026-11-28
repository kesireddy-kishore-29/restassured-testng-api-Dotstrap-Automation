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
| 1 | `POST /v1/accounts` | 201 | 30 | `qa-d664f92f-a1d9-413c-9722-6a977908d53f` |
| 2 | `POST /v1/accounts` | 201 | 24 | `qa-2908b776-234a-41bb-9f34-312c9e633f1e` |
| 3 | `POST /v1/auth/token` | 200 | 16 | `qa-f5d213c4-f756-49ed-9ba6-03e7434b7093` |
| 4 | `POST /v1/conversations` | 201 | 8 | `qa-fa9eac40-81a1-4a4c-b48f-5afa3f948ccd` |
| 5 | `POST /v1/auth/token` | 400 | 19 | `qa-27c895f1-c911-4d9c-8dec-bfde7b9aa5fd` |
| 6 | `POST /v1/auth/token` | 200 | 42 | `qa-ccc57eff-6259-4c97-a592-b1592aaf30a0` |
| 7 | `DELETE /v1/accounts/me` | 204 | 49 | `qa-4f85b809-0a63-4c43-ba02-6678b2c7c7d0` |
| 8 | `POST /v1/auth/token` | 401 | 14 | `qa-3b56efb0-8b3b-4289-bd6b-ff40db7b6996` |
| 9 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-21af8195-f47e-4220-b028-3fd64640f542` |
| 10 | `POST /v1/auth/token` | 401 | 28 | `qa-92cc3d30-aada-4044-a309-aab46ed468ee` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d664f92f-a1d9-413c-9722-6a977908d53f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d664f92f-a1d9-413c-9722-6a977908d53f
Content-Type: application/json

--- request body ---
{"handle":"qa-d5cfdfcdb3d8","displayName":"QA d5cfdfcdb3d8","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-d664f92f-a1d9-413c-9722-6a977908d53f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 10
Location: /v1/accounts/qa-d5cfdfcdb3d8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fbb6be94-c9fd-4730-9be1-a65cfd42ff79","handle":"qa-d5cfdfcdb3d8","displayName":"QA d5cfdfcdb3d8","region":"eu","role":"user","createdAt":"2026-11-25T11:27:57.202516912Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-2908b776-234a-41bb-9f34-312c9e633f1e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2908b776-234a-41bb-9f34-312c9e633f1e
Content-Type: application/json

--- request body ---
{"handle":"qa-2613b4032dcb","displayName":"QA 2613b4032dcb","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-2908b776-234a-41bb-9f34-312c9e633f1e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 567
RateLimit-Reset: 10
Location: /v1/accounts/qa-2613b4032dcb
X-Served-Region: eu
Content-Length: 181

{"id":"acc_aac50419-a80a-4772-a20b-528e891a921b","handle":"qa-2613b4032dcb","displayName":"QA 2613b4032dcb","region":"eu","role":"user","createdAt":"2026-11-25T11:27:57.231724374Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-f5d213c4-f756-49ed-9ba6-03e7434b7093

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f5d213c4-f756-49ed-9ba6-03e7434b7093
Content-Type: application/json

--- request body ---
{"handle":"qa-d5cfdfcdb3d8","password":"****"}

--- response: 200 in 16 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-f5d213c4-f756-49ed-9ba6-03e7434b7093
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 556
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fbb6be94-c9fd-4730-9be1-a65cfd42ff79"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-fa9eac40-81a1-4a4c-b48f-5afa3f948ccd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa9eac40-81a1-4a4c-b48f-5afa3f948ccd
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-2613b4032dcb","subject":"Error contract","message":"Hi"}

--- response: 201 in 8 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-fa9eac40-81a1-4a4c-b48f-5afa3f948ccd
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
Location: /v1/conversations/cnv_092e7cfc-a633-4770-9120-07530d572a43
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_092e7cfc-a633-4770-9120-07530d572a43","subject":"Error contract","status":"open","region":"eu","participants":["qa-d5cfdfcdb3d8","qa-2613b4032dcb"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-25T11:27:57.289432160Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-27c895f1-c911-4d9c-8dec-bfde7b9aa5fd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-27c895f1-c911-4d9c-8dec-bfde7b9aa5fd
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 19 ms ---
Date: Wed, 25 Nov 2026 11:27:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-27c895f1-c911-4d9c-8dec-bfde7b9aa5fd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 545
RateLimit-Reset: 10
Content-Length: 255

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/auth/token","correlationId":"qa-27c895f1-c911-4d9c-8dec-bfde7b9aa5fd"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-ccc57eff-6259-4c97-a592-b1592aaf30a0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ccc57eff-6259-4c97-a592-b1592aaf30a0
Content-Type: application/json

--- request body ---
{"handle":"qa-2613b4032dcb","password":"****"}

--- response: 200 in 42 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-ccc57eff-6259-4c97-a592-b1592aaf30a0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 515
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_aac50419-a80a-4772-a20b-528e891a921b"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4f85b809-0a63-4c43-ba02-6678b2c7c7d0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4f85b809-0a63-4c43-ba02-6678b2c7c7d0
Content-Type: application/json

--- response: 204 in 49 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4f85b809-0a63-4c43-ba02-6678b2c7c7d0
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
correlation: qa-3b56efb0-8b3b-4289-bd6b-ff40db7b6996

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3b56efb0-8b3b-4289-bd6b-ff40db7b6996
Content-Type: application/json

--- request body ---
{"handle":"qa-2613b4032dcb","password":"****"}

--- response: 401 in 14 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3b56efb0-8b3b-4289-bd6b-ff40db7b6996
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 497
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3b56efb0-8b3b-4289-bd6b-ff40db7b6996"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-21af8195-f47e-4220-b028-3fd64640f542

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-21af8195-f47e-4220-b028-3fd64640f542
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-21af8195-f47e-4220-b028-3fd64640f542
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
correlation: qa-92cc3d30-aada-4044-a309-aab46ed468ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-92cc3d30-aada-4044-a309-aab46ed468ee
Content-Type: application/json

--- request body ---
{"handle":"qa-d5cfdfcdb3d8","password":"****"}

--- response: 401 in 28 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-92cc3d30-aada-4044-a309-aab46ed468ee
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 482
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-92cc3d30-aada-4044-a309-aab46ed468ee"}
```
