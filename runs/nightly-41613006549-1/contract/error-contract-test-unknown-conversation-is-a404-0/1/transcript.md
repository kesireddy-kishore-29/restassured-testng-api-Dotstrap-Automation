# Transcript: Every conversation operation answers an unknown id with a 404 problem [GET /v1/conversations/{id}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#unknownConversationIsA404[0]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 25 | `qa-cb42be07-a40f-4681-ace5-a6827d6cdbb8` |
| 2 | `POST /v1/auth/token` | 200 | 10 | `qa-f8bfa1f0-a70c-4f8a-9203-fabcc671a21d` |
| 3 | `GET /v1/conversations/{id}` | 404 | 18 | `qa-827fc72c-407b-45e4-b0a1-79aa9df680c1` |
| 4 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-646bb3d0-8ece-4447-a2b4-4bbe3183bbb9` |
| 5 | `POST /v1/auth/token` | 401 | 15 | `qa-37c0bbba-4a40-4ed0-85ef-1100a9f9529b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-cb42be07-a40f-4681-ace5-a6827d6cdbb8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb42be07-a40f-4681-ace5-a6827d6cdbb8
Content-Type: application/json

--- request body ---
{"handle":"qa-db0fdc189f5d","displayName":"QA db0fdc189f5d","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-cb42be07-a40f-4681-ace5-a6827d6cdbb8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 305
RateLimit-Reset: 8
Location: /v1/accounts/qa-db0fdc189f5d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ecfd51a7-2057-4567-99be-4f4f86cd1148","handle":"qa-db0fdc189f5d","displayName":"QA db0fdc189f5d","region":"eu","role":"user","createdAt":"2026-11-03T09:41:33.782946434Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-f8bfa1f0-a70c-4f8a-9203-fabcc671a21d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f8bfa1f0-a70c-4f8a-9203-fabcc671a21d
Content-Type: application/json

--- request body ---
{"handle":"qa-db0fdc189f5d","password":"****"}

--- response: 200 in 10 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-f8bfa1f0-a70c-4f8a-9203-fabcc671a21d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 303
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ecfd51a7-2057-4567-99be-4f4f86cd1148"}
```

## 3. GET /v1/conversations/{id}

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist
correlation: qa-827fc72c-407b-45e4-b0a1-79aa9df680c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-827fc72c-407b-45e4-b0a1-79aa9df680c1
Content-Type: application/json

--- response: 404 in 18 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-827fc72c-407b-45e4-b0a1-79aa9df680c1
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
Content-Length: 253

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist","correlationId":"qa-827fc72c-407b-45e4-b0a1-79aa9df680c1"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-646bb3d0-8ece-4447-a2b4-4bbe3183bbb9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-646bb3d0-8ece-4447-a2b4-4bbe3183bbb9
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-646bb3d0-8ece-4447-a2b4-4bbe3183bbb9
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

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-37c0bbba-4a40-4ed0-85ef-1100a9f9529b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-37c0bbba-4a40-4ed0-85ef-1100a9f9529b
Content-Type: application/json

--- request body ---
{"handle":"qa-db0fdc189f5d","password":"****"}

--- response: 401 in 15 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-37c0bbba-4a40-4ed0-85ef-1100a9f9529b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 295
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-37c0bbba-4a40-4ed0-85ef-1100a9f9529b"}
```
