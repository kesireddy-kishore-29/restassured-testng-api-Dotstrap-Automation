# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/auth/token, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[1]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 19 | `qa-7108cf44-f8d4-43d7-95d1-56622ff9cd79` |
| 2 | `POST /v1/accounts` | 201 | 43 | `qa-e33989ca-7541-46b4-a375-b16f781cd831` |
| 3 | `POST /v1/auth/token` | 200 | 29 | `qa-a38ab036-b963-4b10-844b-a2c485c75089` |
| 4 | `POST /v1/conversations` | 201 | 22 | `qa-a23e6baa-cc57-4ce2-89e9-b4e2912a0537` |
| 5 | `POST /v1/auth/token` | 415 | 74 | `qa-97669598-8e39-4577-91e8-edf98898a027` |
| 6 | `POST /v1/auth/token` | 200 | 39 | `qa-0ce28eaa-cca8-4955-9d2a-1765770cc560` |
| 7 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-60d2cdc6-2a6e-4252-8ebf-f205d6e1155a` |
| 8 | `POST /v1/auth/token` | 401 | 34 | `qa-54669fd0-5116-4c2f-89e1-78ed5485d018` |
| 9 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-296bd998-7fd7-4fff-ac51-8e4483b9ee08` |
| 10 | `POST /v1/auth/token` | 401 | 53 | `qa-060ee81e-0df5-422f-8635-6b8e214364b9` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-7108cf44-f8d4-43d7-95d1-56622ff9cd79

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7108cf44-f8d4-43d7-95d1-56622ff9cd79
Content-Type: application/json

--- request body ---
{"handle":"qa-3231c39e200a","displayName":"QA 3231c39e200a","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Sat, 14 Nov 2026 09:05:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-7108cf44-f8d4-43d7-95d1-56622ff9cd79
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 10
Location: /v1/accounts/qa-3231c39e200a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_11e37830-cbd5-40e7-9d83-004912f778cd","handle":"qa-3231c39e200a","displayName":"QA 3231c39e200a","region":"eu","role":"user","createdAt":"2026-11-14T09:05:09.967665906Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-e33989ca-7541-46b4-a375-b16f781cd831

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e33989ca-7541-46b4-a375-b16f781cd831
Content-Type: application/json

--- request body ---
{"handle":"qa-6ee218826344","displayName":"QA 6ee218826344","password":"****","region":"eu"}

--- response: 201 in 43 ms ---
Date: Sat, 14 Nov 2026 09:05:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-e33989ca-7541-46b4-a375-b16f781cd831
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 565
RateLimit-Reset: 9
Location: /v1/accounts/qa-6ee218826344
X-Served-Region: eu
Content-Length: 181

{"id":"acc_22d7688a-5d27-4628-a680-5ef7a68b1671","handle":"qa-6ee218826344","displayName":"QA 6ee218826344","region":"eu","role":"user","createdAt":"2026-11-14T09:05:10.022776724Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-a38ab036-b963-4b10-844b-a2c485c75089

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a38ab036-b963-4b10-844b-a2c485c75089
Content-Type: application/json

--- request body ---
{"handle":"qa-3231c39e200a","password":"****"}

--- response: 200 in 29 ms ---
Date: Sat, 14 Nov 2026 09:05:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-a38ab036-b963-4b10-844b-a2c485c75089
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 559
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_11e37830-cbd5-40e7-9d83-004912f778cd"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-a23e6baa-cc57-4ce2-89e9-b4e2912a0537

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a23e6baa-cc57-4ce2-89e9-b4e2912a0537
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-6ee218826344","subject":"Error contract","message":"Hi"}

--- response: 201 in 22 ms ---
Date: Sat, 14 Nov 2026 09:05:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-a23e6baa-cc57-4ce2-89e9-b4e2912a0537
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
Location: /v1/conversations/cnv_42b2f328-bbcc-4762-8ba7-803a63dc67c8
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_42b2f328-bbcc-4762-8ba7-803a63dc67c8","subject":"Error contract","status":"open","region":"eu","participants":["qa-3231c39e200a","qa-6ee218826344"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-14T09:05:10.101696311Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-97669598-8e39-4577-91e8-edf98898a027

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-97669598-8e39-4577-91e8-edf98898a027
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 74 ms ---
Date: Sat, 14 Nov 2026 09:05:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-97669598-8e39-4577-91e8-edf98898a027
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 546
RateLimit-Reset: 9
Content-Length: 254

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/auth/token","correlationId":"qa-97669598-8e39-4577-91e8-edf98898a027"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-0ce28eaa-cca8-4955-9d2a-1765770cc560

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ce28eaa-cca8-4955-9d2a-1765770cc560
Content-Type: application/json

--- request body ---
{"handle":"qa-6ee218826344","password":"****"}

--- response: 200 in 39 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-0ce28eaa-cca8-4955-9d2a-1765770cc560
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 525
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_22d7688a-5d27-4628-a680-5ef7a68b1671"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-60d2cdc6-2a6e-4252-8ebf-f205d6e1155a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-60d2cdc6-2a6e-4252-8ebf-f205d6e1155a
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-60d2cdc6-2a6e-4252-8ebf-f205d6e1155a
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
correlation: qa-54669fd0-5116-4c2f-89e1-78ed5485d018

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-54669fd0-5116-4c2f-89e1-78ed5485d018
Content-Type: application/json

--- request body ---
{"handle":"qa-6ee218826344","password":"****"}

--- response: 401 in 34 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-54669fd0-5116-4c2f-89e1-78ed5485d018
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 507
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-54669fd0-5116-4c2f-89e1-78ed5485d018"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-296bd998-7fd7-4fff-ac51-8e4483b9ee08

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-296bd998-7fd7-4fff-ac51-8e4483b9ee08
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-296bd998-7fd7-4fff-ac51-8e4483b9ee08
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
correlation: qa-060ee81e-0df5-422f-8635-6b8e214364b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-060ee81e-0df5-422f-8635-6b8e214364b9
Content-Type: application/json

--- request body ---
{"handle":"qa-3231c39e200a","password":"****"}

--- response: 401 in 53 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-060ee81e-0df5-422f-8635-6b8e214364b9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 495
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-060ee81e-0df5-422f-8635-6b8e214364b9"}
```
