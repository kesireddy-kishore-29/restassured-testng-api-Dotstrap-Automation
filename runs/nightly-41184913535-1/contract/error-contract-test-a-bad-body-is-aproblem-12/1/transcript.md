# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations/{id}/messages, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[12]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 41 | `qa-bf20aa03-1606-4597-9ef7-b0c312f75e2e` |
| 2 | `POST /v1/accounts` | 201 | 25 | `qa-5c83f883-6240-40b6-b151-1d20420dd3e9` |
| 3 | `POST /v1/auth/token` | 200 | 29 | `qa-9bbeb751-c819-44b4-b015-5a3db9c7e52e` |
| 4 | `POST /v1/conversations` | 201 | 19 | `qa-52c2dd02-aba6-442d-9de1-5ce415d65d04` |
| 5 | `POST /v1/conversations/{id}/messages` | 400 | 21 | `qa-23e1d884-cf22-4127-8f3a-8bf0eb155e99` |
| 6 | `POST /v1/auth/token` | 200 | 32 | `qa-4e9b8adb-2de5-4fdf-812b-8a2b5b289c37` |
| 7 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-edf1feaf-2b39-4b07-ab38-9e1d02cc8d99` |
| 8 | `POST /v1/auth/token` | 401 | 27 | `qa-67e7165b-8a30-4d8b-b8d2-b13f6305f69c` |
| 9 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-1b72dad7-ae32-449d-b0fc-9d5b886781f8` |
| 10 | `POST /v1/auth/token` | 401 | 23 | `qa-cbdd8345-fd20-4eee-827f-81908cdb0d45` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-bf20aa03-1606-4597-9ef7-b0c312f75e2e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf20aa03-1606-4597-9ef7-b0c312f75e2e
Content-Type: application/json

--- request body ---
{"handle":"qa-f4ef2d815aff","displayName":"QA f4ef2d815aff","password":"****","region":"eu"}

--- response: 201 in 41 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-bf20aa03-1606-4597-9ef7-b0c312f75e2e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 389
RateLimit-Reset: 7
Location: /v1/accounts/qa-f4ef2d815aff
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5d2bc1f7-b95b-4635-8c9d-b5b9d9dd2b09","handle":"qa-f4ef2d815aff","displayName":"QA f4ef2d815aff","region":"eu","role":"user","createdAt":"2026-10-31T08:31:36.161277115Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-5c83f883-6240-40b6-b151-1d20420dd3e9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5c83f883-6240-40b6-b151-1d20420dd3e9
Content-Type: application/json

--- request body ---
{"handle":"qa-25899c73f0a0","displayName":"QA 25899c73f0a0","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-5c83f883-6240-40b6-b151-1d20420dd3e9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 383
RateLimit-Reset: 7
Location: /v1/accounts/qa-25899c73f0a0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4c0ad4d7-7f4e-4540-9a5e-37bfb09535ab","handle":"qa-25899c73f0a0","displayName":"QA 25899c73f0a0","region":"eu","role":"user","createdAt":"2026-10-31T08:31:36.199836212Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-9bbeb751-c819-44b4-b015-5a3db9c7e52e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9bbeb751-c819-44b4-b015-5a3db9c7e52e
Content-Type: application/json

--- request body ---
{"handle":"qa-f4ef2d815aff","password":"****"}

--- response: 200 in 29 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-9bbeb751-c819-44b4-b015-5a3db9c7e52e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 377
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5d2bc1f7-b95b-4635-8c9d-b5b9d9dd2b09"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-52c2dd02-aba6-442d-9de1-5ce415d65d04

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-52c2dd02-aba6-442d-9de1-5ce415d65d04
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-25899c73f0a0","subject":"Error contract","message":"Hi"}

--- response: 201 in 19 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-52c2dd02-aba6-442d-9de1-5ce415d65d04
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
Location: /v1/conversations/cnv_682972b4-c980-4aa5-b20f-d87e1504d374
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_682972b4-c980-4aa5-b20f-d87e1504d374","subject":"Error contract","status":"open","region":"eu","participants":["qa-f4ef2d815aff","qa-25899c73f0a0"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-31T08:31:36.277300380Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_682972b4-c980-4aa5-b20f-d87e1504d374/messages
correlation: qa-23e1d884-cf22-4127-8f3a-8bf0eb155e99

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-23e1d884-cf22-4127-8f3a-8bf0eb155e99
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 21 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-23e1d884-cf22-4127-8f3a-8bf0eb155e99
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
Content-Length: 308

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/conversations/cnv_682972b4-c980-4aa5-b20f-d87e1504d374/messages","correlationId":"qa-23e1d884-cf22-4127-8f3a-8bf0eb155e99"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-4e9b8adb-2de5-4fdf-812b-8a2b5b289c37

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4e9b8adb-2de5-4fdf-812b-8a2b5b289c37
Content-Type: application/json

--- request body ---
{"handle":"qa-25899c73f0a0","password":"****"}

--- response: 200 in 32 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-4e9b8adb-2de5-4fdf-812b-8a2b5b289c37
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 359
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4c0ad4d7-7f4e-4540-9a5e-37bfb09535ab"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-edf1feaf-2b39-4b07-ab38-9e1d02cc8d99

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-edf1feaf-2b39-4b07-ab38-9e1d02cc8d99
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-edf1feaf-2b39-4b07-ab38-9e1d02cc8d99
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
correlation: qa-67e7165b-8a30-4d8b-b8d2-b13f6305f69c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-67e7165b-8a30-4d8b-b8d2-b13f6305f69c
Content-Type: application/json

--- request body ---
{"handle":"qa-25899c73f0a0","password":"****"}

--- response: 401 in 27 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-67e7165b-8a30-4d8b-b8d2-b13f6305f69c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 355
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-67e7165b-8a30-4d8b-b8d2-b13f6305f69c"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1b72dad7-ae32-449d-b0fc-9d5b886781f8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1b72dad7-ae32-449d-b0fc-9d5b886781f8
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1b72dad7-ae32-449d-b0fc-9d5b886781f8
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
correlation: qa-cbdd8345-fd20-4eee-827f-81908cdb0d45

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cbdd8345-fd20-4eee-827f-81908cdb0d45
Content-Type: application/json

--- request body ---
{"handle":"qa-f4ef2d815aff","password":"****"}

--- response: 401 in 23 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cbdd8345-fd20-4eee-827f-81908cdb0d45
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 350
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cbdd8345-fd20-4eee-827f-81908cdb0d45"}
```
