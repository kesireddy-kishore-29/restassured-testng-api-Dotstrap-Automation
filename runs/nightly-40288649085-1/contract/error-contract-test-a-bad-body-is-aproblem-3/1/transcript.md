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
| 1 | `POST /v1/accounts` | 201 | 21 | `qa-f72cfd50-c19a-4d07-a869-c4dedd6a738e` |
| 2 | `POST /v1/accounts` | 201 | 20 | `qa-f36d72b1-7f28-4672-b3ac-a9b4398f91d1` |
| 3 | `POST /v1/auth/token` | 200 | 26 | `qa-6ef1bdb7-dc08-416c-ac05-25f3520a575a` |
| 4 | `POST /v1/conversations` | 201 | 14 | `qa-5268b06b-b3d9-484a-b50c-ed4eb516a84f` |
| 5 | `POST /v1/accounts` | 400 | 13 | `qa-5602bc94-d736-4174-8f54-2d13f7d1de70` |
| 6 | `POST /v1/auth/token` | 200 | 48 | `qa-46dea150-8f08-4ed4-9782-a3d0cce1f074` |
| 7 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-89d59ffb-45a9-46de-b4fc-92b36039cebf` |
| 8 | `POST /v1/auth/token` | 401 | 27 | `qa-2e16454a-8f76-4618-b50b-11dd2b631113` |
| 9 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-8068ec9e-3883-4146-8a31-6ed32c82c5ad` |
| 10 | `POST /v1/auth/token` | 401 | 31 | `qa-aa92cc24-6649-4278-a7f0-5fcfc8d60cd1` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f72cfd50-c19a-4d07-a869-c4dedd6a738e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f72cfd50-c19a-4d07-a869-c4dedd6a738e
Content-Type: application/json

--- request body ---
{"handle":"qa-dcee3a9392ff","displayName":"QA dcee3a9392ff","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-f72cfd50-c19a-4d07-a869-c4dedd6a738e
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
Location: /v1/accounts/qa-dcee3a9392ff
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f3f6668d-f969-430c-a8df-bec52ef815fe","handle":"qa-dcee3a9392ff","displayName":"QA dcee3a9392ff","region":"eu","role":"user","createdAt":"2026-10-26T07:54:46.257926512Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-f36d72b1-7f28-4672-b3ac-a9b4398f91d1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f36d72b1-7f28-4672-b3ac-a9b4398f91d1
Content-Type: application/json

--- request body ---
{"handle":"qa-057d7c9fa72a","displayName":"QA 057d7c9fa72a","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-f36d72b1-7f28-4672-b3ac-a9b4398f91d1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 566
RateLimit-Reset: 10
Location: /v1/accounts/qa-057d7c9fa72a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_22da0f87-3297-4cab-a6ed-f5a1bad7cab5","handle":"qa-057d7c9fa72a","displayName":"QA 057d7c9fa72a","region":"eu","role":"user","createdAt":"2026-10-26T07:54:46.283466904Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-6ef1bdb7-dc08-416c-ac05-25f3520a575a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ef1bdb7-dc08-416c-ac05-25f3520a575a
Content-Type: application/json

--- request body ---
{"handle":"qa-dcee3a9392ff","password":"****"}

--- response: 200 in 26 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-6ef1bdb7-dc08-416c-ac05-25f3520a575a
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f3f6668d-f969-430c-a8df-bec52ef815fe"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-5268b06b-b3d9-484a-b50c-ed4eb516a84f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5268b06b-b3d9-484a-b50c-ed4eb516a84f
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-057d7c9fa72a","subject":"Error contract","message":"Hi"}

--- response: 201 in 14 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-5268b06b-b3d9-484a-b50c-ed4eb516a84f
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
Location: /v1/conversations/cnv_92784c0b-0647-44eb-83fb-9d5e51557a06
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_92784c0b-0647-44eb-83fb-9d5e51557a06","subject":"Error contract","status":"open","region":"eu","participants":["qa-dcee3a9392ff","qa-057d7c9fa72a"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-26T07:54:46.350954150Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-5602bc94-d736-4174-8f54-2d13f7d1de70

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5602bc94-d736-4174-8f54-2d13f7d1de70
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 13 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5602bc94-d736-4174-8f54-2d13f7d1de70
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
Content-Length: 253

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/accounts","correlationId":"qa-5602bc94-d736-4174-8f54-2d13f7d1de70"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-46dea150-8f08-4ed4-9782-a3d0cce1f074

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-46dea150-8f08-4ed4-9782-a3d0cce1f074
Content-Type: application/json

--- request body ---
{"handle":"qa-057d7c9fa72a","password":"****"}

--- response: 200 in 48 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-46dea150-8f08-4ed4-9782-a3d0cce1f074
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 524
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_22da0f87-3297-4cab-a6ed-f5a1bad7cab5"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-89d59ffb-45a9-46de-b4fc-92b36039cebf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-89d59ffb-45a9-46de-b4fc-92b36039cebf
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-89d59ffb-45a9-46de-b4fc-92b36039cebf
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
correlation: qa-2e16454a-8f76-4618-b50b-11dd2b631113

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2e16454a-8f76-4618-b50b-11dd2b631113
Content-Type: application/json

--- request body ---
{"handle":"qa-057d7c9fa72a","password":"****"}

--- response: 401 in 27 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2e16454a-8f76-4618-b50b-11dd2b631113
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 498
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2e16454a-8f76-4618-b50b-11dd2b631113"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8068ec9e-3883-4146-8a31-6ed32c82c5ad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8068ec9e-3883-4146-8a31-6ed32c82c5ad
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8068ec9e-3883-4146-8a31-6ed32c82c5ad
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
correlation: qa-aa92cc24-6649-4278-a7f0-5fcfc8d60cd1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aa92cc24-6649-4278-a7f0-5fcfc8d60cd1
Content-Type: application/json

--- request body ---
{"handle":"qa-dcee3a9392ff","password":"****"}

--- response: 401 in 31 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-aa92cc24-6649-4278-a7f0-5fcfc8d60cd1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 484
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-aa92cc24-6649-4278-a7f0-5fcfc8d60cd1"}
```
