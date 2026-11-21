# Transcript: Every conversation operation answers an outsider with a 403 problem [GET /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[1]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 33 | `qa-d711c82e-9195-4e59-b50d-1ffc1a0b8a49` |
| 2 | `POST /v1/accounts` | 201 | 31 | `qa-5f8ff4e3-5899-4be3-b57a-66713a1c5f90` |
| 3 | `POST /v1/accounts` | 201 | 33 | `qa-3f483f0a-041f-4682-8d2b-9affee8837b0` |
| 4 | `POST /v1/auth/token` | 200 | 34 | `qa-f5f8af8d-2bd6-4694-b623-7eddf2e26b8f` |
| 5 | `POST /v1/conversations` | 201 | 9 | `qa-9daba618-cd5a-4b60-ad07-b7e0b383010c` |
| 6 | `POST /v1/auth/token` | 200 | 23 | `qa-b7990715-f083-4ed1-b0dd-c5e05303cfba` |
| 7 | `GET /v1/conversations/{id}/messages` | 403 | 12 | `qa-8aeefd90-7bb5-4d56-8f0d-01b9f16888ad` |
| 8 | `DELETE /v1/accounts/me` | 204 | 59 | `qa-4abf01fd-c6f8-4e99-b5fb-b9856d342f18` |
| 9 | `POST /v1/auth/token` | 401 | 44 | `qa-3c3b6449-7bbd-4982-a28f-af4fe717e568` |
| 10 | `POST /v1/auth/token` | 200 | 62 | `qa-b129df1d-5638-4f24-979a-3231529327d2` |
| 11 | `DELETE /v1/accounts/me` | 204 | 118 | `qa-8479335b-e4a1-428d-88b9-aa940ff923c0` |
| 12 | `POST /v1/auth/token` | 401 | 22 | `qa-bbc6331d-7bb8-463e-b65f-a7f003805ea6` |
| 13 | `DELETE /v1/accounts/me` | 204 | 51 | `qa-cd8add0a-cfea-4e69-aae7-f8a7ba9d4b23` |
| 14 | `POST /v1/auth/token` | 401 | 18 | `qa-a45981da-1756-414a-a3cd-568a6cddad2a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d711c82e-9195-4e59-b50d-1ffc1a0b8a49

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d711c82e-9195-4e59-b50d-1ffc1a0b8a49
Content-Type: application/json

--- request body ---
{"handle":"qa-885a6e93c6c9","displayName":"QA 885a6e93c6c9","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-d711c82e-9195-4e59-b50d-1ffc1a0b8a49
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 544
RateLimit-Reset: 9
Location: /v1/accounts/qa-885a6e93c6c9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8cfc4c7d-ec24-48ef-9c0b-b35a49946390","handle":"qa-885a6e93c6c9","displayName":"QA 885a6e93c6c9","region":"eu","role":"user","createdAt":"2026-11-19T10:29:23.821749351Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-5f8ff4e3-5899-4be3-b57a-66713a1c5f90

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5f8ff4e3-5899-4be3-b57a-66713a1c5f90
Content-Type: application/json

--- request body ---
{"handle":"qa-0d2db891d02a","displayName":"QA 0d2db891d02a","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-5f8ff4e3-5899-4be3-b57a-66713a1c5f90
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 537
RateLimit-Reset: 9
Location: /v1/accounts/qa-0d2db891d02a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fbe38f86-e61a-4a7c-ba04-875d820aa22e","handle":"qa-0d2db891d02a","displayName":"QA 0d2db891d02a","region":"eu","role":"user","createdAt":"2026-11-19T10:29:23.863687276Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-3f483f0a-041f-4682-8d2b-9affee8837b0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3f483f0a-041f-4682-8d2b-9affee8837b0
Content-Type: application/json

--- request body ---
{"handle":"qa-9c325c6138eb","displayName":"QA 9c325c6138eb","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-3f483f0a-041f-4682-8d2b-9affee8837b0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 534
RateLimit-Reset: 9
Location: /v1/accounts/qa-9c325c6138eb
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d05a7b2e-94d4-4457-81b1-c7eaa75a26e2","handle":"qa-9c325c6138eb","displayName":"QA 9c325c6138eb","region":"eu","role":"user","createdAt":"2026-11-19T10:29:23.917297109Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-f5f8af8d-2bd6-4694-b623-7eddf2e26b8f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f5f8af8d-2bd6-4694-b623-7eddf2e26b8f
Content-Type: application/json

--- request body ---
{"handle":"qa-885a6e93c6c9","password":"****"}

--- response: 200 in 34 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-f5f8af8d-2bd6-4694-b623-7eddf2e26b8f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 531
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8cfc4c7d-ec24-48ef-9c0b-b35a49946390"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-9daba618-cd5a-4b60-ad07-b7e0b383010c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9daba618-cd5a-4b60-ad07-b7e0b383010c
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-0d2db891d02a","subject":"Error contract","message":"Hi"}

--- response: 201 in 9 ms ---
Date: Thu, 19 Nov 2026 10:29:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-9daba618-cd5a-4b60-ad07-b7e0b383010c
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
Location: /v1/conversations/cnv_a4c6299c-f8c0-4027-b3fe-6ed80af3eef4
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_a4c6299c-f8c0-4027-b3fe-6ed80af3eef4","subject":"Error contract","status":"open","region":"eu","participants":["qa-885a6e93c6c9","qa-0d2db891d02a"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-19T10:29:24.008668971Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-b7990715-f083-4ed1-b0dd-c5e05303cfba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b7990715-f083-4ed1-b0dd-c5e05303cfba
Content-Type: application/json

--- request body ---
{"handle":"qa-9c325c6138eb","password":"****"}

--- response: 200 in 23 ms ---
Date: Thu, 19 Nov 2026 10:29:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-b7990715-f083-4ed1-b0dd-c5e05303cfba
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 526
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d05a7b2e-94d4-4457-81b1-c7eaa75a26e2"}
```

## 7. GET /v1/conversations/{id}/messages

```text
#7 GET http://localhost:7070/v1/conversations/cnv_a4c6299c-f8c0-4027-b3fe-6ed80af3eef4/messages
correlation: qa-8aeefd90-7bb5-4d56-8f0d-01b9f16888ad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8aeefd90-7bb5-4d56-8f0d-01b9f16888ad
Content-Type: application/json

--- response: 403 in 12 ms ---
Date: Thu, 19 Nov 2026 10:29:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8aeefd90-7bb5-4d56-8f0d-01b9f16888ad
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
Content-Length: 294

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_a4c6299c-f8c0-4027-b3fe-6ed80af3eef4/messages","correlationId":"qa-8aeefd90-7bb5-4d56-8f0d-01b9f16888ad"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4abf01fd-c6f8-4e99-b5fb-b9856d342f18

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4abf01fd-c6f8-4e99-b5fb-b9856d342f18
Content-Type: application/json

--- response: 204 in 59 ms ---
Date: Thu, 19 Nov 2026 10:29:24 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4abf01fd-c6f8-4e99-b5fb-b9856d342f18
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

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-3c3b6449-7bbd-4982-a28f-af4fe717e568

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3c3b6449-7bbd-4982-a28f-af4fe717e568
Content-Type: application/json

--- request body ---
{"handle":"qa-9c325c6138eb","password":"****"}

--- response: 401 in 44 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3c3b6449-7bbd-4982-a28f-af4fe717e568
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 511
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3c3b6449-7bbd-4982-a28f-af4fe717e568"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-b129df1d-5638-4f24-979a-3231529327d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b129df1d-5638-4f24-979a-3231529327d2
Content-Type: application/json

--- request body ---
{"handle":"qa-0d2db891d02a","password":"****"}

--- response: 200 in 62 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-b129df1d-5638-4f24-979a-3231529327d2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 500
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fbe38f86-e61a-4a7c-ba04-875d820aa22e"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8479335b-e4a1-428d-88b9-aa940ff923c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8479335b-e4a1-428d-88b9-aa940ff923c0
Content-Type: application/json

--- response: 204 in 118 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8479335b-e4a1-428d-88b9-aa940ff923c0
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

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-bbc6331d-7bb8-463e-b65f-a7f003805ea6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bbc6331d-7bb8-463e-b65f-a7f003805ea6
Content-Type: application/json

--- request body ---
{"handle":"qa-0d2db891d02a","password":"****"}

--- response: 401 in 22 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bbc6331d-7bb8-463e-b65f-a7f003805ea6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 479
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bbc6331d-7bb8-463e-b65f-a7f003805ea6"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cd8add0a-cfea-4e69-aae7-f8a7ba9d4b23

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd8add0a-cfea-4e69-aae7-f8a7ba9d4b23
Content-Type: application/json

--- response: 204 in 51 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cd8add0a-cfea-4e69-aae7-f8a7ba9d4b23
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

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-a45981da-1756-414a-a3cd-568a6cddad2a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a45981da-1756-414a-a3cd-568a6cddad2a
Content-Type: application/json

--- request body ---
{"handle":"qa-885a6e93c6c9","password":"****"}

--- response: 401 in 18 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a45981da-1756-414a-a3cd-568a6cddad2a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 464
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a45981da-1756-414a-a3cd-568a6cddad2a"}
```
