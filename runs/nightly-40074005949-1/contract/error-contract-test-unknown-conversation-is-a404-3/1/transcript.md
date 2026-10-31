# Transcript: Every conversation operation answers an unknown id with a 404 problem [POST /v1/conversations/{id}/read]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#unknownConversationIsA404[3]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 19 | `qa-164c9b9e-3636-4f41-89a2-280afd210dc9` |
| 2 | `POST /v1/auth/token` | 200 | 22 | `qa-915e25cc-fdd6-4747-a0d8-454a897502c8` |
| 3 | `POST /v1/conversations/{id}/read` | 404 | 16 | `qa-98cb0b72-b0e7-4043-a81f-49f6af3ecc13` |
| 4 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-7cb87479-5246-49cb-852e-966364563ae7` |
| 5 | `POST /v1/auth/token` | 401 | 8 | `qa-afb337be-c2c4-4b0d-b010-199d191e0cf4` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-164c9b9e-3636-4f41-89a2-280afd210dc9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-164c9b9e-3636-4f41-89a2-280afd210dc9
Content-Type: application/json

--- request body ---
{"handle":"qa-f968b283d635","displayName":"QA f968b283d635","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-164c9b9e-3636-4f41-89a2-280afd210dc9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 285
RateLimit-Reset: 7
Location: /v1/accounts/qa-f968b283d635
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e626e8be-3563-4aad-b744-1e7805e1cb67","handle":"qa-f968b283d635","displayName":"QA f968b283d635","region":"eu","role":"user","createdAt":"2026-10-24T07:25:04.274053203Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-915e25cc-fdd6-4747-a0d8-454a897502c8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-915e25cc-fdd6-4747-a0d8-454a897502c8
Content-Type: application/json

--- request body ---
{"handle":"qa-f968b283d635","password":"****"}

--- response: 200 in 22 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-915e25cc-fdd6-4747-a0d8-454a897502c8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 283
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e626e8be-3563-4aad-b744-1e7805e1cb67"}
```

## 3. POST /v1/conversations/{id}/read

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/read
correlation: qa-98cb0b72-b0e7-4043-a81f-49f6af3ecc13

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-98cb0b72-b0e7-4043-a81f-49f6af3ecc13
Content-Type: application/json

--- response: 404 in 16 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-98cb0b72-b0e7-4043-a81f-49f6af3ecc13
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
Content-Length: 258

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/read","correlationId":"qa-98cb0b72-b0e7-4043-a81f-49f6af3ecc13"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7cb87479-5246-49cb-852e-966364563ae7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7cb87479-5246-49cb-852e-966364563ae7
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7cb87479-5246-49cb-852e-966364563ae7
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
correlation: qa-afb337be-c2c4-4b0d-b010-199d191e0cf4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-afb337be-c2c4-4b0d-b010-199d191e0cf4
Content-Type: application/json

--- request body ---
{"handle":"qa-f968b283d635","password":"****"}

--- response: 401 in 8 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-afb337be-c2c4-4b0d-b010-199d191e0cf4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 275
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-afb337be-c2c4-4b0d-b010-199d191e0cf4"}
```
