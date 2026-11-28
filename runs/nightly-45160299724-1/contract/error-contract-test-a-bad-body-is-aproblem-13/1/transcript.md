# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations/{id}/messages, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[13]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 19 | `qa-4cd86ff6-3d28-4a1d-85ab-7b68733706d0` |
| 2 | `POST /v1/accounts` | 201 | 41 | `qa-6d308dd7-d7d5-40bb-a724-9063607d595b` |
| 3 | `POST /v1/auth/token` | 200 | 42 | `qa-b628a558-4f37-4011-9f76-d5a8bed05c63` |
| 4 | `POST /v1/conversations` | 201 | 20 | `qa-732d7d0d-9d2e-4ba5-bc40-3907accc19b8` |
| 5 | `POST /v1/conversations/{id}/messages` | 415 | 27 | `qa-998ca474-2cf5-4c08-902a-6fb4a68d0a95` |
| 6 | `POST /v1/auth/token` | 200 | 17 | `qa-a5dc40cd-0e83-48ec-a546-3be1e1be78bc` |
| 7 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-7a209997-b8e0-475b-b5fb-6ff7e7678fbc` |
| 8 | `POST /v1/auth/token` | 401 | 13 | `qa-7bdfe9a4-5e9e-48c6-8f5f-065c253a715e` |
| 9 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-03567045-9049-4bb2-b0ee-475ad7bad0d6` |
| 10 | `POST /v1/auth/token` | 401 | 14 | `qa-a8ef985a-f6ed-4b57-85f5-0ea72558557e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-4cd86ff6-3d28-4a1d-85ab-7b68733706d0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4cd86ff6-3d28-4a1d-85ab-7b68733706d0
Content-Type: application/json

--- request body ---
{"handle":"qa-b3bef68ea866","displayName":"QA b3bef68ea866","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-4cd86ff6-3d28-4a1d-85ab-7b68733706d0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 361
RateLimit-Reset: 8
Location: /v1/accounts/qa-b3bef68ea866
X-Served-Region: eu
Content-Length: 181

{"id":"acc_cc37f9c5-3eac-4afd-ace1-30cf1b87f7d1","handle":"qa-b3bef68ea866","displayName":"QA b3bef68ea866","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.780920374Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-6d308dd7-d7d5-40bb-a724-9063607d595b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6d308dd7-d7d5-40bb-a724-9063607d595b
Content-Type: application/json

--- request body ---
{"handle":"qa-d06b9af4ce93","displayName":"QA d06b9af4ce93","password":"****","region":"eu"}

--- response: 201 in 41 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-6d308dd7-d7d5-40bb-a724-9063607d595b
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
Location: /v1/accounts/qa-d06b9af4ce93
X-Served-Region: eu
Content-Length: 181

{"id":"acc_54fbf780-934e-4d58-a980-59b943e0cebb","handle":"qa-d06b9af4ce93","displayName":"QA d06b9af4ce93","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.838900263Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-b628a558-4f37-4011-9f76-d5a8bed05c63

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b628a558-4f37-4011-9f76-d5a8bed05c63
Content-Type: application/json

--- request body ---
{"handle":"qa-b3bef68ea866","password":"****"}

--- response: 200 in 42 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-b628a558-4f37-4011-9f76-d5a8bed05c63
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 346
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cc37f9c5-3eac-4afd-ace1-30cf1b87f7d1"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-732d7d0d-9d2e-4ba5-bc40-3907accc19b8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-732d7d0d-9d2e-4ba5-bc40-3907accc19b8
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-d06b9af4ce93","subject":"Error contract","message":"Hi"}

--- response: 201 in 20 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-732d7d0d-9d2e-4ba5-bc40-3907accc19b8
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
Location: /v1/conversations/cnv_968c9dc4-bc2f-404c-b20b-e99cc551a1aa
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_968c9dc4-bc2f-404c-b20b-e99cc551a1aa","subject":"Error contract","status":"open","region":"eu","participants":["qa-b3bef68ea866","qa-d06b9af4ce93"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-23T10:54:59.921917158Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_968c9dc4-bc2f-404c-b20b-e99cc551a1aa/messages
correlation: qa-998ca474-2cf5-4c08-902a-6fb4a68d0a95

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-998ca474-2cf5-4c08-902a-6fb4a68d0a95
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 27 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-998ca474-2cf5-4c08-902a-6fb4a68d0a95
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
Content-Length: 307

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/conversations/cnv_968c9dc4-bc2f-404c-b20b-e99cc551a1aa/messages","correlationId":"qa-998ca474-2cf5-4c08-902a-6fb4a68d0a95"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-a5dc40cd-0e83-48ec-a546-3be1e1be78bc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a5dc40cd-0e83-48ec-a546-3be1e1be78bc
Content-Type: application/json

--- request body ---
{"handle":"qa-d06b9af4ce93","password":"****"}

--- response: 200 in 17 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-a5dc40cd-0e83-48ec-a546-3be1e1be78bc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 334
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_54fbf780-934e-4d58-a980-59b943e0cebb"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7a209997-b8e0-475b-b5fb-6ff7e7678fbc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7a209997-b8e0-475b-b5fb-6ff7e7678fbc
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7a209997-b8e0-475b-b5fb-6ff7e7678fbc
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
correlation: qa-7bdfe9a4-5e9e-48c6-8f5f-065c253a715e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7bdfe9a4-5e9e-48c6-8f5f-065c253a715e
Content-Type: application/json

--- request body ---
{"handle":"qa-d06b9af4ce93","password":"****"}

--- response: 401 in 13 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7bdfe9a4-5e9e-48c6-8f5f-065c253a715e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 330
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7bdfe9a4-5e9e-48c6-8f5f-065c253a715e"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-03567045-9049-4bb2-b0ee-475ad7bad0d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-03567045-9049-4bb2-b0ee-475ad7bad0d6
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-03567045-9049-4bb2-b0ee-475ad7bad0d6
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
correlation: qa-a8ef985a-f6ed-4b57-85f5-0ea72558557e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a8ef985a-f6ed-4b57-85f5-0ea72558557e
Content-Type: application/json

--- request body ---
{"handle":"qa-b3bef68ea866","password":"****"}

--- response: 401 in 14 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a8ef985a-f6ed-4b57-85f5-0ea72558557e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 325
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a8ef985a-f6ed-4b57-85f5-0ea72558557e"}
```
