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
| 1 | `POST /v1/accounts` | 201 | 40 | `qa-d7dd9672-8b1c-41f2-aca0-7ec01c4cbda6` |
| 2 | `POST /v1/accounts` | 201 | 14 | `qa-caff3221-0932-494f-90f0-79021586aba9` |
| 3 | `POST /v1/auth/token` | 200 | 40 | `qa-e8c65b39-2de5-492c-80f6-68110e11aca6` |
| 4 | `POST /v1/conversations` | 201 | 19 | `qa-58ec2346-7c0c-4296-890b-8028c2804cb6` |
| 5 | `POST /v1/conversations` | 415 | 8 | `qa-31538044-00ba-4529-b304-e02f2277119d` |
| 6 | `POST /v1/auth/token` | 200 | 33 | `qa-9fd5677f-c5d1-4232-9b84-586ce7fa16f7` |
| 7 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-1f43c104-0520-41a6-8b8f-819a6fc61d8b` |
| 8 | `POST /v1/auth/token` | 401 | 13 | `qa-1a3d3ab5-895c-42ab-be4c-66cc6c922884` |
| 9 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-3a6ac34a-f765-4a4f-8158-e74ae1e695a2` |
| 10 | `POST /v1/auth/token` | 401 | 15 | `qa-47df38f3-6bf2-45b9-9ab7-7019fd18dfb3` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d7dd9672-8b1c-41f2-aca0-7ec01c4cbda6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d7dd9672-8b1c-41f2-aca0-7ec01c4cbda6
Content-Type: application/json

--- request body ---
{"handle":"qa-fc1b14e6ea44","displayName":"QA fc1b14e6ea44","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-d7dd9672-8b1c-41f2-aca0-7ec01c4cbda6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 405
RateLimit-Reset: 8
Location: /v1/accounts/qa-fc1b14e6ea44
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e6c5734d-1598-4779-a708-6af49d4215d2","handle":"qa-fc1b14e6ea44","displayName":"QA fc1b14e6ea44","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.391740118Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-caff3221-0932-494f-90f0-79021586aba9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-caff3221-0932-494f-90f0-79021586aba9
Content-Type: application/json

--- request body ---
{"handle":"qa-7cf25c1da422","displayName":"QA 7cf25c1da422","password":"****","region":"eu"}

--- response: 201 in 14 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-caff3221-0932-494f-90f0-79021586aba9
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
Location: /v1/accounts/qa-7cf25c1da422
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3ba76e56-0e49-4ea5-bd28-4cc0f1c42a35","handle":"qa-7cf25c1da422","displayName":"QA 7cf25c1da422","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.417288468Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-e8c65b39-2de5-492c-80f6-68110e11aca6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e8c65b39-2de5-492c-80f6-68110e11aca6
Content-Type: application/json

--- request body ---
{"handle":"qa-fc1b14e6ea44","password":"****"}

--- response: 200 in 40 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-e8c65b39-2de5-492c-80f6-68110e11aca6
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e6c5734d-1598-4779-a708-6af49d4215d2"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-58ec2346-7c0c-4296-890b-8028c2804cb6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-58ec2346-7c0c-4296-890b-8028c2804cb6
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-7cf25c1da422","subject":"Error contract","message":"Hi"}

--- response: 201 in 19 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-58ec2346-7c0c-4296-890b-8028c2804cb6
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
Location: /v1/conversations/cnv_16951920-6ff0-41ae-b035-55a0c3ae8297
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_16951920-6ff0-41ae-b035-55a0c3ae8297","subject":"Error contract","status":"open","region":"eu","participants":["qa-fc1b14e6ea44","qa-7cf25c1da422"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-23T10:54:59.518489380Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-31538044-00ba-4529-b304-e02f2277119d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-31538044-00ba-4529-b304-e02f2277119d
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 8 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-31538044-00ba-4529-b304-e02f2277119d
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

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/conversations","correlationId":"qa-31538044-00ba-4529-b304-e02f2277119d"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-9fd5677f-c5d1-4232-9b84-586ce7fa16f7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9fd5677f-c5d1-4232-9b84-586ce7fa16f7
Content-Type: application/json

--- request body ---
{"handle":"qa-7cf25c1da422","password":"****"}

--- response: 200 in 33 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-9fd5677f-c5d1-4232-9b84-586ce7fa16f7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 376
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3ba76e56-0e49-4ea5-bd28-4cc0f1c42a35"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1f43c104-0520-41a6-8b8f-819a6fc61d8b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1f43c104-0520-41a6-8b8f-819a6fc61d8b
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1f43c104-0520-41a6-8b8f-819a6fc61d8b
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
correlation: qa-1a3d3ab5-895c-42ab-be4c-66cc6c922884

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1a3d3ab5-895c-42ab-be4c-66cc6c922884
Content-Type: application/json

--- request body ---
{"handle":"qa-7cf25c1da422","password":"****"}

--- response: 401 in 13 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1a3d3ab5-895c-42ab-be4c-66cc6c922884
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 369
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1a3d3ab5-895c-42ab-be4c-66cc6c922884"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3a6ac34a-f765-4a4f-8158-e74ae1e695a2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a6ac34a-f765-4a4f-8158-e74ae1e695a2
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3a6ac34a-f765-4a4f-8158-e74ae1e695a2
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
correlation: qa-47df38f3-6bf2-45b9-9ab7-7019fd18dfb3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-47df38f3-6bf2-45b9-9ab7-7019fd18dfb3
Content-Type: application/json

--- request body ---
{"handle":"qa-fc1b14e6ea44","password":"****"}

--- response: 401 in 15 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-47df38f3-6bf2-45b9-9ab7-7019fd18dfb3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 362
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-47df38f3-6bf2-45b9-9ab7-7019fd18dfb3"}
```
