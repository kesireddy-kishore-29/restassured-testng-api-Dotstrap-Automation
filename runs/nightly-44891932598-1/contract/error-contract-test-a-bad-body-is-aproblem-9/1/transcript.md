# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[9]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 38 | `qa-135de2f7-2631-42ee-bc98-47bbcceab595` |
| 2 | `POST /v1/accounts` | 201 | 27 | `qa-ec6b6bc9-16b1-4d82-a118-bfa9714f5f40` |
| 3 | `POST /v1/auth/token` | 200 | 42 | `qa-bdbfa3e2-5a77-4f1d-88cc-5668b781e47d` |
| 4 | `POST /v1/conversations` | 201 | 17 | `qa-13672e7f-23bb-4c56-afd8-c49f37b0749a` |
| 5 | `POST /v1/conversations` | 400 | 14 | `qa-d5e16100-783e-4720-8068-03d14b146bd2` |
| 6 | `POST /v1/auth/token` | 200 | 43 | `qa-3e6b3cf5-b1c4-4b48-8c65-6d1f4f64fb98` |
| 7 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-cc348620-4e1f-40ca-959f-bdb19da1a590` |
| 8 | `POST /v1/auth/token` | 401 | 40 | `qa-35ad5bea-e237-4843-90a1-65d40f057a02` |
| 9 | `DELETE /v1/accounts/me` | 204 | 26 | `qa-a1f361d0-0228-42ae-9b14-e9eba299e193` |
| 10 | `POST /v1/auth/token` | 401 | 9 | `qa-aa8b3be2-9ed1-4971-9212-53bc11cd969d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-135de2f7-2631-42ee-bc98-47bbcceab595

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-135de2f7-2631-42ee-bc98-47bbcceab595
Content-Type: application/json

--- request body ---
{"handle":"qa-20b599b5aecb","displayName":"QA 20b599b5aecb","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-135de2f7-2631-42ee-bc98-47bbcceab595
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 401
RateLimit-Reset: 7
Location: /v1/accounts/qa-20b599b5aecb
X-Served-Region: eu
Content-Length: 181

{"id":"acc_43b45986-9303-469f-8a69-5605bbeb8eb3","handle":"qa-20b599b5aecb","displayName":"QA 20b599b5aecb","region":"eu","role":"user","createdAt":"2026-11-21T09:57:11.625304347Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-ec6b6bc9-16b1-4d82-a118-bfa9714f5f40

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ec6b6bc9-16b1-4d82-a118-bfa9714f5f40
Content-Type: application/json

--- request body ---
{"handle":"qa-871291e2cbd6","displayName":"QA 871291e2cbd6","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-ec6b6bc9-16b1-4d82-a118-bfa9714f5f40
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 397
RateLimit-Reset: 7
Location: /v1/accounts/qa-871291e2cbd6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d3e0f93d-df9a-401c-a815-fa0a61090eb1","handle":"qa-871291e2cbd6","displayName":"QA 871291e2cbd6","region":"eu","role":"user","createdAt":"2026-11-21T09:57:11.670123603Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-bdbfa3e2-5a77-4f1d-88cc-5668b781e47d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bdbfa3e2-5a77-4f1d-88cc-5668b781e47d
Content-Type: application/json

--- request body ---
{"handle":"qa-20b599b5aecb","password":"****"}

--- response: 200 in 42 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-bdbfa3e2-5a77-4f1d-88cc-5668b781e47d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 392
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_43b45986-9303-469f-8a69-5605bbeb8eb3"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-13672e7f-23bb-4c56-afd8-c49f37b0749a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-13672e7f-23bb-4c56-afd8-c49f37b0749a
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-871291e2cbd6","subject":"Error contract","message":"Hi"}

--- response: 201 in 17 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-13672e7f-23bb-4c56-afd8-c49f37b0749a
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
Location: /v1/conversations/cnv_5a5c3434-68f5-422a-92a5-02fd5c1a684c
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_5a5c3434-68f5-422a-92a5-02fd5c1a684c","subject":"Error contract","status":"open","region":"eu","participants":["qa-20b599b5aecb","qa-871291e2cbd6"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-21T09:57:11.758588423Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-d5e16100-783e-4720-8068-03d14b146bd2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d5e16100-783e-4720-8068-03d14b146bd2
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 14 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d5e16100-783e-4720-8068-03d14b146bd2
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
Content-Length: 258

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/conversations","correlationId":"qa-d5e16100-783e-4720-8068-03d14b146bd2"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-3e6b3cf5-b1c4-4b48-8c65-6d1f4f64fb98

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3e6b3cf5-b1c4-4b48-8c65-6d1f4f64fb98
Content-Type: application/json

--- request body ---
{"handle":"qa-871291e2cbd6","password":"****"}

--- response: 200 in 43 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-3e6b3cf5-b1c4-4b48-8c65-6d1f4f64fb98
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 373
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d3e0f93d-df9a-401c-a815-fa0a61090eb1"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cc348620-4e1f-40ca-959f-bdb19da1a590

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc348620-4e1f-40ca-959f-bdb19da1a590
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cc348620-4e1f-40ca-959f-bdb19da1a590
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
correlation: qa-35ad5bea-e237-4843-90a1-65d40f057a02

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35ad5bea-e237-4843-90a1-65d40f057a02
Content-Type: application/json

--- request body ---
{"handle":"qa-871291e2cbd6","password":"****"}

--- response: 401 in 40 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-35ad5bea-e237-4843-90a1-65d40f057a02
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 365
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-35ad5bea-e237-4843-90a1-65d40f057a02"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a1f361d0-0228-42ae-9b14-e9eba299e193

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a1f361d0-0228-42ae-9b14-e9eba299e193
Content-Type: application/json

--- response: 204 in 26 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a1f361d0-0228-42ae-9b14-e9eba299e193
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
correlation: qa-aa8b3be2-9ed1-4971-9212-53bc11cd969d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aa8b3be2-9ed1-4971-9212-53bc11cd969d
Content-Type: application/json

--- request body ---
{"handle":"qa-20b599b5aecb","password":"****"}

--- response: 401 in 9 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-aa8b3be2-9ed1-4971-9212-53bc11cd969d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 357
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-aa8b3be2-9ed1-4971-9212-53bc11cd969d"}
```
