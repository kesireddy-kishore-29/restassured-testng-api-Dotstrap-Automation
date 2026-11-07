# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[10]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 40 | `qa-9ecff2e6-651a-4a08-bfe9-6afceb910bd4` |
| 2 | `POST /v1/accounts` | 201 | 50 | `qa-320c3782-fa35-4e21-b567-6ebb34b65f6b` |
| 3 | `POST /v1/auth/token` | 200 | 31 | `qa-b5b41837-ecdf-4507-adb0-e3773b9c67eb` |
| 4 | `POST /v1/conversations` | 201 | 10 | `qa-d59319e7-139d-4915-83ff-b5cea1db42d1` |
| 5 | `POST /v1/conversations` | 415 | 35 | `qa-6716c63c-dba5-437d-89bc-11fc2a087272` |
| 6 | `POST /v1/auth/token` | 200 | 30 | `qa-9d008baa-302c-4a72-9aef-0d67bcb69c27` |
| 7 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-4dce946d-cae9-4d8f-902e-f56eb3673be5` |
| 8 | `POST /v1/auth/token` | 401 | 16 | `qa-65b50016-190d-4f6a-8405-0e56848a6fc1` |
| 9 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-62190202-fb23-4e56-b5d9-4771cf17391e` |
| 10 | `POST /v1/auth/token` | 401 | 15 | `qa-37c4eb58-bab7-47bf-b12c-b14fad1effd3` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9ecff2e6-651a-4a08-bfe9-6afceb910bd4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ecff2e6-651a-4a08-bfe9-6afceb910bd4
Content-Type: application/json

--- request body ---
{"handle":"qa-bd719c8241b6","displayName":"QA bd719c8241b6","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-9ecff2e6-651a-4a08-bfe9-6afceb910bd4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 433
RateLimit-Reset: 7
Location: /v1/accounts/qa-bd719c8241b6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e1463d94-301a-4f82-bb65-d62eed55fb91","handle":"qa-bd719c8241b6","displayName":"QA bd719c8241b6","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.520730975Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-320c3782-fa35-4e21-b567-6ebb34b65f6b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-320c3782-fa35-4e21-b567-6ebb34b65f6b
Content-Type: application/json

--- request body ---
{"handle":"qa-aaab02447932","displayName":"QA aaab02447932","password":"****","region":"eu"}

--- response: 201 in 50 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-320c3782-fa35-4e21-b567-6ebb34b65f6b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 421
RateLimit-Reset: 7
Location: /v1/accounts/qa-aaab02447932
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4198dc0b-d25c-4fc1-a47e-976a6ea44d4a","handle":"qa-aaab02447932","displayName":"QA aaab02447932","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.593724569Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-b5b41837-ecdf-4507-adb0-e3773b9c67eb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b5b41837-ecdf-4507-adb0-e3773b9c67eb
Content-Type: application/json

--- request body ---
{"handle":"qa-bd719c8241b6","password":"****"}

--- response: 200 in 31 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-b5b41837-ecdf-4507-adb0-e3773b9c67eb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 415
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e1463d94-301a-4f82-bb65-d62eed55fb91"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-d59319e7-139d-4915-83ff-b5cea1db42d1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d59319e7-139d-4915-83ff-b5cea1db42d1
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-aaab02447932","subject":"Error contract","message":"Hi"}

--- response: 201 in 10 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-d59319e7-139d-4915-83ff-b5cea1db42d1
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
Location: /v1/conversations/cnv_9e5fbc70-38fe-4449-bb16-294675cc2f04
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_9e5fbc70-38fe-4449-bb16-294675cc2f04","subject":"Error contract","status":"open","region":"eu","participants":["qa-bd719c8241b6","qa-aaab02447932"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-30T08:46:04.666510883Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-6716c63c-dba5-437d-89bc-11fc2a087272

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6716c63c-dba5-437d-89bc-11fc2a087272
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 35 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6716c63c-dba5-437d-89bc-11fc2a087272
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
Content-Length: 257

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/conversations","correlationId":"qa-6716c63c-dba5-437d-89bc-11fc2a087272"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-9d008baa-302c-4a72-9aef-0d67bcb69c27

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d008baa-302c-4a72-9aef-0d67bcb69c27
Content-Type: application/json

--- request body ---
{"handle":"qa-aaab02447932","password":"****"}

--- response: 200 in 30 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-9d008baa-302c-4a72-9aef-0d67bcb69c27
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 404
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4198dc0b-d25c-4fc1-a47e-976a6ea44d4a"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4dce946d-cae9-4d8f-902e-f56eb3673be5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4dce946d-cae9-4d8f-902e-f56eb3673be5
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4dce946d-cae9-4d8f-902e-f56eb3673be5
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
correlation: qa-65b50016-190d-4f6a-8405-0e56848a6fc1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-65b50016-190d-4f6a-8405-0e56848a6fc1
Content-Type: application/json

--- request body ---
{"handle":"qa-aaab02447932","password":"****"}

--- response: 401 in 16 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-65b50016-190d-4f6a-8405-0e56848a6fc1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 396
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-65b50016-190d-4f6a-8405-0e56848a6fc1"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-62190202-fb23-4e56-b5d9-4771cf17391e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-62190202-fb23-4e56-b5d9-4771cf17391e
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-62190202-fb23-4e56-b5d9-4771cf17391e
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
correlation: qa-37c4eb58-bab7-47bf-b12c-b14fad1effd3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-37c4eb58-bab7-47bf-b12c-b14fad1effd3
Content-Type: application/json

--- request body ---
{"handle":"qa-bd719c8241b6","password":"****"}

--- response: 401 in 15 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-37c4eb58-bab7-47bf-b12c-b14fad1effd3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 387
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-37c4eb58-bab7-47bf-b12c-b14fad1effd3"}
```
