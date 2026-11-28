# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [PATCH /v1/accounts/me, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[7]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 29 | `qa-3d81bcc2-dad9-4fc1-9405-14b9368a4a09` |
| 2 | `POST /v1/accounts` | 201 | 46 | `qa-190109f2-0e25-41f5-a55d-9a0080d9b5ed` |
| 3 | `POST /v1/auth/token` | 200 | 25 | `qa-fd615992-7e11-47ad-b242-e955a8bfeb5a` |
| 4 | `POST /v1/conversations` | 201 | 24 | `qa-9ed83e5a-2241-42c4-b5fe-85eb61d82ac7` |
| 5 | `PATCH /v1/accounts/me` | 415 | 38 | `qa-ee9781a3-f274-4470-9b7c-50e9bf05f533` |
| 6 | `POST /v1/auth/token` | 200 | 13 | `qa-7483c68f-006a-492b-9b11-4a03343146d9` |
| 7 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-79d340e4-ea3a-4345-842a-18869c0479be` |
| 8 | `POST /v1/auth/token` | 401 | 23 | `qa-8cda6a9c-234e-4951-8bd9-eabae971e24c` |
| 9 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-8063e80d-4ad5-4f8a-9560-21ce86f92c90` |
| 10 | `POST /v1/auth/token` | 401 | 16 | `qa-8b96c4bd-5701-41f6-9a1e-0d248073dd03` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3d81bcc2-dad9-4fc1-9405-14b9368a4a09

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d81bcc2-dad9-4fc1-9405-14b9368a4a09
Content-Type: application/json

--- request body ---
{"handle":"qa-9e12a3f98774","displayName":"QA 9e12a3f98774","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-3d81bcc2-dad9-4fc1-9405-14b9368a4a09
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 462
RateLimit-Reset: 8
Location: /v1/accounts/qa-9e12a3f98774
X-Served-Region: eu
Content-Length: 181

{"id":"acc_57f5f4c3-d3f8-40e6-b7e2-560d2a30fe0e","handle":"qa-9e12a3f98774","displayName":"QA 9e12a3f98774","region":"eu","role":"user","createdAt":"2026-11-23T10:54:58.925803307Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-190109f2-0e25-41f5-a55d-9a0080d9b5ed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-190109f2-0e25-41f5-a55d-9a0080d9b5ed
Content-Type: application/json

--- request body ---
{"handle":"qa-b6d51eba6168","displayName":"QA b6d51eba6168","password":"****","region":"eu"}

--- response: 201 in 46 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-190109f2-0e25-41f5-a55d-9a0080d9b5ed
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 450
RateLimit-Reset: 8
Location: /v1/accounts/qa-b6d51eba6168
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c060c36b-fb28-4f06-904b-9ee29bea8e9d","handle":"qa-b6d51eba6168","displayName":"QA b6d51eba6168","region":"eu","role":"user","createdAt":"2026-11-23T10:54:58.977221575Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-fd615992-7e11-47ad-b242-e955a8bfeb5a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd615992-7e11-47ad-b242-e955a8bfeb5a
Content-Type: application/json

--- request body ---
{"handle":"qa-9e12a3f98774","password":"****"}

--- response: 200 in 25 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-fd615992-7e11-47ad-b242-e955a8bfeb5a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 445
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_57f5f4c3-d3f8-40e6-b7e2-560d2a30fe0e"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-9ed83e5a-2241-42c4-b5fe-85eb61d82ac7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ed83e5a-2241-42c4-b5fe-85eb61d82ac7
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-b6d51eba6168","subject":"Error contract","message":"Hi"}

--- response: 201 in 24 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-9ed83e5a-2241-42c4-b5fe-85eb61d82ac7
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
Location: /v1/conversations/cnv_722d7090-e879-40b6-9439-dc615882d3d4
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_722d7090-e879-40b6-9439-dc615882d3d4","subject":"Error contract","status":"open","region":"eu","participants":["qa-9e12a3f98774","qa-b6d51eba6168"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-23T10:54:59.068498488Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-ee9781a3-f274-4470-9b7c-50e9bf05f533

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee9781a3-f274-4470-9b7c-50e9bf05f533
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 38 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ee9781a3-f274-4470-9b7c-50e9bf05f533
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
Content-Length: 255

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/accounts/me","correlationId":"qa-ee9781a3-f274-4470-9b7c-50e9bf05f533"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-7483c68f-006a-492b-9b11-4a03343146d9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7483c68f-006a-492b-9b11-4a03343146d9
Content-Type: application/json

--- request body ---
{"handle":"qa-b6d51eba6168","password":"****"}

--- response: 200 in 13 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-7483c68f-006a-492b-9b11-4a03343146d9
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c060c36b-fb28-4f06-904b-9ee29bea8e9d"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-79d340e4-ea3a-4345-842a-18869c0479be

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-79d340e4-ea3a-4345-842a-18869c0479be
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-79d340e4-ea3a-4345-842a-18869c0479be
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
correlation: qa-8cda6a9c-234e-4951-8bd9-eabae971e24c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8cda6a9c-234e-4951-8bd9-eabae971e24c
Content-Type: application/json

--- request body ---
{"handle":"qa-b6d51eba6168","password":"****"}

--- response: 401 in 23 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8cda6a9c-234e-4951-8bd9-eabae971e24c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 418
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8cda6a9c-234e-4951-8bd9-eabae971e24c"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8063e80d-4ad5-4f8a-9560-21ce86f92c90

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8063e80d-4ad5-4f8a-9560-21ce86f92c90
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8063e80d-4ad5-4f8a-9560-21ce86f92c90
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
correlation: qa-8b96c4bd-5701-41f6-9a1e-0d248073dd03

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8b96c4bd-5701-41f6-9a1e-0d248073dd03
Content-Type: application/json

--- request body ---
{"handle":"qa-9e12a3f98774","password":"****"}

--- response: 401 in 16 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8b96c4bd-5701-41f6-9a1e-0d248073dd03
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 409
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8b96c4bd-5701-41f6-9a1e-0d248073dd03"}
```
