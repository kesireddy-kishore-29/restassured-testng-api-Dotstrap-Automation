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
| 1 | `POST /v1/accounts` | 201 | 22 | `qa-2ef086da-f2c9-4a1f-a29b-42ce4a3c43a6` |
| 2 | `POST /v1/accounts` | 201 | 11 | `qa-8cb58b07-db97-4091-a70e-6e77f886a7a0` |
| 3 | `POST /v1/auth/token` | 200 | 25 | `qa-95da61f8-121b-4da5-8da3-c9b4632c1abb` |
| 4 | `POST /v1/conversations` | 201 | 13 | `qa-cf0cc75c-50ce-4d2b-9465-62da5f2cfeb2` |
| 5 | `POST /v1/conversations/{id}/messages` | 400 | 56 | `qa-a4005ecf-99c3-4281-90ad-1ad9f994a9a7` |
| 6 | `POST /v1/auth/token` | 200 | 30 | `qa-619afa1f-0cb1-46f6-90b3-357dfaad513a` |
| 7 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-08a92e5b-9429-4a8f-a72e-7d33faf23c83` |
| 8 | `POST /v1/auth/token` | 401 | 7 | `qa-a9f4eca9-2190-4367-9790-8ea68af75ff3` |
| 9 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-b959c731-d477-43b8-84dd-1f80b8c2ff86` |
| 10 | `POST /v1/auth/token` | 401 | 7 | `qa-ea9afe37-ae33-4da8-bd4e-17748f24c8f2` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2ef086da-f2c9-4a1f-a29b-42ce4a3c43a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2ef086da-f2c9-4a1f-a29b-42ce4a3c43a6
Content-Type: application/json

--- request body ---
{"handle":"qa-0b0a14c8e5e7","displayName":"QA 0b0a14c8e5e7","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-2ef086da-f2c9-4a1f-a29b-42ce4a3c43a6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 352
RateLimit-Reset: 7
Location: /v1/accounts/qa-0b0a14c8e5e7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_84147631-8a78-4f8f-95bb-7c50cd94207f","handle":"qa-0b0a14c8e5e7","displayName":"QA 0b0a14c8e5e7","region":"eu","role":"user","createdAt":"2026-11-13T09:42:08.041435457Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-8cb58b07-db97-4091-a70e-6e77f886a7a0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8cb58b07-db97-4091-a70e-6e77f886a7a0
Content-Type: application/json

--- request body ---
{"handle":"qa-d2f5ff1c15d8","displayName":"QA d2f5ff1c15d8","password":"****","region":"eu"}

--- response: 201 in 11 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-8cb58b07-db97-4091-a70e-6e77f886a7a0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 349
RateLimit-Reset: 7
Location: /v1/accounts/qa-d2f5ff1c15d8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2c0eeafb-e4fe-403a-bccd-6269ec0ffd19","handle":"qa-d2f5ff1c15d8","displayName":"QA d2f5ff1c15d8","region":"eu","role":"user","createdAt":"2026-11-13T09:42:08.073834308Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-95da61f8-121b-4da5-8da3-c9b4632c1abb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-95da61f8-121b-4da5-8da3-c9b4632c1abb
Content-Type: application/json

--- request body ---
{"handle":"qa-0b0a14c8e5e7","password":"****"}

--- response: 200 in 25 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-95da61f8-121b-4da5-8da3-c9b4632c1abb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 344
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_84147631-8a78-4f8f-95bb-7c50cd94207f"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-cf0cc75c-50ce-4d2b-9465-62da5f2cfeb2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cf0cc75c-50ce-4d2b-9465-62da5f2cfeb2
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-d2f5ff1c15d8","subject":"Error contract","message":"Hi"}

--- response: 201 in 13 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-cf0cc75c-50ce-4d2b-9465-62da5f2cfeb2
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
Location: /v1/conversations/cnv_fcb909fd-9c6e-49c0-acef-552b4e8d7e44
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_fcb909fd-9c6e-49c0-acef-552b4e8d7e44","subject":"Error contract","status":"open","region":"eu","participants":["qa-0b0a14c8e5e7","qa-d2f5ff1c15d8"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-13T09:42:08.136905439Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_fcb909fd-9c6e-49c0-acef-552b4e8d7e44/messages
correlation: qa-a4005ecf-99c3-4281-90ad-1ad9f994a9a7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a4005ecf-99c3-4281-90ad-1ad9f994a9a7
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 56 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a4005ecf-99c3-4281-90ad-1ad9f994a9a7
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

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/conversations/cnv_fcb909fd-9c6e-49c0-acef-552b4e8d7e44/messages","correlationId":"qa-a4005ecf-99c3-4281-90ad-1ad9f994a9a7"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-619afa1f-0cb1-46f6-90b3-357dfaad513a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-619afa1f-0cb1-46f6-90b3-357dfaad513a
Content-Type: application/json

--- request body ---
{"handle":"qa-d2f5ff1c15d8","password":"****"}

--- response: 200 in 30 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-619afa1f-0cb1-46f6-90b3-357dfaad513a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 327
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2c0eeafb-e4fe-403a-bccd-6269ec0ffd19"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-08a92e5b-9429-4a8f-a72e-7d33faf23c83

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08a92e5b-9429-4a8f-a72e-7d33faf23c83
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: text/plain
X-Correlation-Id: qa-08a92e5b-9429-4a8f-a72e-7d33faf23c83
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
correlation: qa-a9f4eca9-2190-4367-9790-8ea68af75ff3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a9f4eca9-2190-4367-9790-8ea68af75ff3
Content-Type: application/json

--- request body ---
{"handle":"qa-d2f5ff1c15d8","password":"****"}

--- response: 401 in 7 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a9f4eca9-2190-4367-9790-8ea68af75ff3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 321
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a9f4eca9-2190-4367-9790-8ea68af75ff3"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b959c731-d477-43b8-84dd-1f80b8c2ff86

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b959c731-d477-43b8-84dd-1f80b8c2ff86
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b959c731-d477-43b8-84dd-1f80b8c2ff86
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
correlation: qa-ea9afe37-ae33-4da8-bd4e-17748f24c8f2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ea9afe37-ae33-4da8-bd4e-17748f24c8f2
Content-Type: application/json

--- request body ---
{"handle":"qa-0b0a14c8e5e7","password":"****"}

--- response: 401 in 7 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ea9afe37-ae33-4da8-bd4e-17748f24c8f2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 315
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ea9afe37-ae33-4da8-bd4e-17748f24c8f2"}
```
