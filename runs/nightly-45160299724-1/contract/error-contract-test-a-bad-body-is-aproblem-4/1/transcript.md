# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/accounts, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[4]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 49 | `qa-1d4bf918-3727-49ec-8ad5-f1c15cd2239d` |
| 2 | `POST /v1/accounts` | 201 | 65 | `qa-f3e696df-98d0-408c-9d51-8c5865f54551` |
| 3 | `POST /v1/auth/token` | 200 | 26 | `qa-e584d54b-9ee5-4fcb-a14c-b5473156e090` |
| 4 | `POST /v1/conversations` | 201 | 21 | `qa-8ed05db9-dc76-4c52-80cc-a59188e524b0` |
| 5 | `POST /v1/accounts` | 415 | 27 | `qa-261f96cf-30a0-4398-b7a6-82bda61c91aa` |
| 6 | `POST /v1/auth/token` | 200 | 26 | `qa-f796c1e6-c045-4602-83ef-75496e20671a` |
| 7 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-cc472210-f480-4cdc-81e6-9d16f58069fa` |
| 8 | `POST /v1/auth/token` | 401 | 14 | `qa-f38b5d10-7966-4f2f-a14b-e7d66367f6c4` |
| 9 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-6425f5b2-2ef2-4bfb-afe1-4de089a7f8ee` |
| 10 | `POST /v1/auth/token` | 401 | 11 | `qa-166a2041-2c79-4bf0-8858-863547714fc4` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-1d4bf918-3727-49ec-8ad5-f1c15cd2239d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1d4bf918-3727-49ec-8ad5-f1c15cd2239d
Content-Type: application/json

--- request body ---
{"handle":"qa-69c0c518adb4","displayName":"QA 69c0c518adb4","password":"****","region":"eu"}

--- response: 201 in 49 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-1d4bf918-3727-49ec-8ad5-f1c15cd2239d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 475
RateLimit-Reset: 9
Location: /v1/accounts/qa-69c0c518adb4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_11fa1c30-8695-4ce6-9233-8670f4d573e0","handle":"qa-69c0c518adb4","displayName":"QA 69c0c518adb4","region":"eu","role":"user","createdAt":"2026-11-23T10:54:58.818270104Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-f3e696df-98d0-408c-9d51-8c5865f54551

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f3e696df-98d0-408c-9d51-8c5865f54551
Content-Type: application/json

--- request body ---
{"handle":"qa-2d0904b12d12","displayName":"QA 2d0904b12d12","password":"****","region":"eu"}

--- response: 201 in 65 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-f3e696df-98d0-408c-9d51-8c5865f54551
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 468
RateLimit-Reset: 8
Location: /v1/accounts/qa-2d0904b12d12
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9af04716-1757-4f51-a97c-fbe5ef45e91a","handle":"qa-2d0904b12d12","displayName":"QA 2d0904b12d12","region":"eu","role":"user","createdAt":"2026-11-23T10:54:58.903043721Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-e584d54b-9ee5-4fcb-a14c-b5473156e090

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e584d54b-9ee5-4fcb-a14c-b5473156e090
Content-Type: application/json

--- request body ---
{"handle":"qa-69c0c518adb4","password":"****"}

--- response: 200 in 26 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-e584d54b-9ee5-4fcb-a14c-b5473156e090
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 456
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_11fa1c30-8695-4ce6-9233-8670f4d573e0"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-8ed05db9-dc76-4c52-80cc-a59188e524b0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ed05db9-dc76-4c52-80cc-a59188e524b0
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-2d0904b12d12","subject":"Error contract","message":"Hi"}

--- response: 201 in 21 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-8ed05db9-dc76-4c52-80cc-a59188e524b0
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
Location: /v1/conversations/cnv_7c5ed90a-906f-46e4-8734-a3a997ed733d
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_7c5ed90a-906f-46e4-8734-a3a997ed733d","subject":"Error contract","status":"open","region":"eu","participants":["qa-69c0c518adb4","qa-2d0904b12d12"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-23T10:54:58.977246040Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-261f96cf-30a0-4398-b7a6-82bda61c91aa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-261f96cf-30a0-4398-b7a6-82bda61c91aa
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 27 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-261f96cf-30a0-4398-b7a6-82bda61c91aa
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
Content-Length: 252

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/accounts","correlationId":"qa-261f96cf-30a0-4398-b7a6-82bda61c91aa"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-f796c1e6-c045-4602-83ef-75496e20671a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f796c1e6-c045-4602-83ef-75496e20671a
Content-Type: application/json

--- request body ---
{"handle":"qa-2d0904b12d12","password":"****"}

--- response: 200 in 26 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-f796c1e6-c045-4602-83ef-75496e20671a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 437
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9af04716-1757-4f51-a97c-fbe5ef45e91a"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cc472210-f480-4cdc-81e6-9d16f58069fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc472210-f480-4cdc-81e6-9d16f58069fa
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cc472210-f480-4cdc-81e6-9d16f58069fa
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
correlation: qa-f38b5d10-7966-4f2f-a14b-e7d66367f6c4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f38b5d10-7966-4f2f-a14b-e7d66367f6c4
Content-Type: application/json

--- request body ---
{"handle":"qa-2d0904b12d12","password":"****"}

--- response: 401 in 14 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f38b5d10-7966-4f2f-a14b-e7d66367f6c4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 426
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f38b5d10-7966-4f2f-a14b-e7d66367f6c4"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6425f5b2-2ef2-4bfb-afe1-4de089a7f8ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6425f5b2-2ef2-4bfb-afe1-4de089a7f8ee
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6425f5b2-2ef2-4bfb-afe1-4de089a7f8ee
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

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-166a2041-2c79-4bf0-8858-863547714fc4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-166a2041-2c79-4bf0-8858-863547714fc4
Content-Type: application/json

--- request body ---
{"handle":"qa-69c0c518adb4","password":"****"}

--- response: 401 in 11 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-166a2041-2c79-4bf0-8858-863547714fc4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 416
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-166a2041-2c79-4bf0-8858-863547714fc4"}
```
