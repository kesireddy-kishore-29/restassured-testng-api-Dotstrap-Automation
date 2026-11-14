# Transcript: Grants, purchases and spends sum to the balance

| | |
|---|---|
| Test | `com.qaautomation.tests.workflows.LedgerConsistencyTest#historySumsToTheBalance` |
| Features | FEAT-LEDGER-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 13 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 16 | `qa-2d34a3d9-345d-423b-ab88-68dab1239d33` |
| 2 | `POST /v1/accounts` | 201 | 24 | `qa-646781e3-a76b-4f48-a8ab-67db5154701a` |
| 3 | `POST /v1/auth/token` | 200 | 37 | `qa-a8d32743-fb2b-40af-b5d6-1b581336e4c6` |
| 4 | `POST /v1/credits/purchases` | 201 | 23 | `qa-91e612d1-c54d-4aee-91a4-98b49f135e13` |
| 5 | `POST /v1/credits/purchases` | 201 | 11 | `qa-350d8aaf-1a46-4260-bfec-824ac7f15eeb` |
| 6 | `POST /v1/conversations` | 201 | 19 | `qa-1b15ca7e-1097-4d6c-8d97-c1483deb96ea` |
| 7 | `GET /v1/credits/ledger` | 200 | 13 | `qa-3fc4ba3a-8f87-4b14-99ac-062490e26dcc` |
| 8 | `GET /v1/credits/balance` | 200 | 8 | `qa-182a7463-05f0-4705-aa66-0edad3f7a90b` |
| 9 | `POST /v1/auth/token` | 200 | 6 | `qa-092f6b26-1a1a-4d08-82e6-eb65e89533cd` |
| 10 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-9f403646-19ef-4afd-999d-f77855346535` |
| 11 | `POST /v1/auth/token` | 401 | 4 | `qa-097bdc1d-353d-4efd-9066-59811a9d3ffd` |
| 12 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-e678f718-750c-4fee-b4ed-a0f2ec3a8528` |
| 13 | `POST /v1/auth/token` | 401 | 3 | `qa-28776c09-ab93-4766-98eb-41c195c01c22` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2d34a3d9-345d-423b-ab88-68dab1239d33

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2d34a3d9-345d-423b-ab88-68dab1239d33
Content-Type: application/json

--- request body ---
{"handle":"qa-99530420c027","displayName":"QA 99530420c027","password":"****","region":"eu"}

--- response: 201 in 16 ms ---
Date: Sat, 14 Nov 2026 09:05:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-2d34a3d9-345d-423b-ab88-68dab1239d33
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
Location: /v1/accounts/qa-99530420c027
X-Served-Region: eu
Content-Length: 181

{"id":"acc_84559491-c27b-4016-9fdc-b4f5c5a1054d","handle":"qa-99530420c027","displayName":"QA 99530420c027","region":"eu","role":"user","createdAt":"2026-11-14T09:05:19.984587384Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-646781e3-a76b-4f48-a8ab-67db5154701a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-646781e3-a76b-4f48-a8ab-67db5154701a
Content-Type: application/json

--- request body ---
{"handle":"qa-d06e2d36f900","displayName":"QA d06e2d36f900","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-646781e3-a76b-4f48-a8ab-67db5154701a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 10
Location: /v1/accounts/qa-d06e2d36f900
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1b003a9e-b939-4753-8b70-ba04340172c0","handle":"qa-d06e2d36f900","displayName":"QA d06e2d36f900","region":"eu","role":"user","createdAt":"2026-11-14T09:05:20.015374591Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-a8d32743-fb2b-40af-b5d6-1b581336e4c6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a8d32743-fb2b-40af-b5d6-1b581336e4c6
Content-Type: application/json

--- request body ---
{"handle":"qa-99530420c027","password":"****"}

--- response: 200 in 37 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-a8d32743-fb2b-40af-b5d6-1b581336e4c6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 565
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_84559491-c27b-4016-9fdc-b4f5c5a1054d"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-91e612d1-c54d-4aee-91a4-98b49f135e13

--- request headers ---
Accept: application/json
Idempotency-Key: qa-190831e8a7fd458aae5fc837f66453d7
X-Correlation-Id: qa-91e612d1-c54d-4aee-91a4-98b49f135e13
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 23 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-91e612d1-c54d-4aee-91a4-98b49f135e13
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
Location: /v1/credits/purchases/pur_4d98b1b7-6893-4199-a804-807d86ae5474
Content-Length: 144

{"id":"pur_4d98b1b7-6893-4199-a804-807d86ae5474","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-14T09:05:20.139743461Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-350d8aaf-1a46-4260-bfec-824ac7f15eeb

--- request headers ---
Accept: application/json
Idempotency-Key: qa-8b1047a18c764a108a504b1262fa2b97
X-Correlation-Id: qa-350d8aaf-1a46-4260-bfec-824ac7f15eeb
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 201 in 11 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-350d8aaf-1a46-4260-bfec-824ac7f15eeb
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
Location: /v1/credits/purchases/pur_5d60735a-97df-43ab-93bc-b9c5cc60b9b5
Content-Length: 144

{"id":"pur_5d60735a-97df-43ab-93bc-b9c5cc60b9b5","packId":"pack-50","credits":50,"balanceAfter":65,"createdAt":"2026-11-14T09:05:20.165285818Z"}
```

## 6. POST /v1/conversations

```text
#6 POST http://localhost:7070/v1/conversations
correlation: qa-1b15ca7e-1097-4d6c-8d97-c1483deb96ea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1b15ca7e-1097-4d6c-8d97-c1483deb96ea
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-d06e2d36f900","subject":"Paid message","message":"Hi"}

--- response: 201 in 19 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-1b15ca7e-1097-4d6c-8d97-c1483deb96ea
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
Location: /v1/conversations/cnv_4f52ebda-9a5c-44c5-a34f-2d3ce5f5d900
X-Data-Region: eu
Content-Length: 235

{"id":"cnv_4f52ebda-9a5c-44c5-a34f-2d3ce5f5d900","subject":"Paid message","status":"open","region":"eu","participants":["qa-99530420c027","qa-d06e2d36f900"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-14T09:05:20.187191777Z"}
```

## 7. GET /v1/credits/ledger

```text
#7 GET http://localhost:7070/v1/credits/ledger
correlation: qa-3fc4ba3a-8f87-4b14-99ac-062490e26dcc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3fc4ba3a-8f87-4b14-99ac-062490e26dcc
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-3fc4ba3a-8f87-4b14-99ac-062490e26dcc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 791

{"items":[{"id":"led_fbf55273-5f4b-43ba-91f9-6fcc9c4056f7","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-14T09:05:19.984596620Z"},{"id":"led_86b97b6f-ae2c-4e54-919f-e4475b80d1d0","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_4d98b1b7-6893-4199-a804-807d86ae5474","createdAt":"2026-11-14T09:05:20.139743461Z"},{"id":"led_8e18bb45-891d-4354-ae55-54ef49b3db65","type":"purchase","amount":50,"balanceAfter":65,"reference":"pur_5d60735a-97df-43ab-93bc-b9c5cc60b9b5","createdAt":"2026-11-14T09:05:20.165285818Z"},{"id":"led_18e46b0b-5282-4070-86ab-3357f7b34668","type":"spend","amount":-1,"balanceAfter":64,"reference":"cnv_4f52ebda-9a5c-44c5-a34f-2d3ce5f5d900","createdAt":"2026-11-14T09:05:20.187174138Z"}],"total":4,"balance":64}
```

## 8. GET /v1/credits/balance

```text
#8 GET http://localhost:7070/v1/credits/balance
correlation: qa-182a7463-05f0-4705-aa66-0edad3f7a90b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-182a7463-05f0-4705-aa66-0edad3f7a90b
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-182a7463-05f0-4705-aa66-0edad3f7a90b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 55
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 90

{"balance":64,"currency":"credits","accountId":"acc_84559491-c27b-4016-9fdc-b4f5c5a1054d"}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-092f6b26-1a1a-4d08-82e6-eb65e89533cd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-092f6b26-1a1a-4d08-82e6-eb65e89533cd
Content-Type: application/json

--- request body ---
{"handle":"qa-d06e2d36f900","password":"****"}

--- response: 200 in 6 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-092f6b26-1a1a-4d08-82e6-eb65e89533cd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 561
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1b003a9e-b939-4753-8b70-ba04340172c0"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9f403646-19ef-4afd-999d-f77855346535

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9f403646-19ef-4afd-999d-f77855346535
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9f403646-19ef-4afd-999d-f77855346535
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

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-097bdc1d-353d-4efd-9066-59811a9d3ffd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-097bdc1d-353d-4efd-9066-59811a9d3ffd
Content-Type: application/json

--- request body ---
{"handle":"qa-d06e2d36f900","password":"****"}

--- response: 401 in 4 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-097bdc1d-353d-4efd-9066-59811a9d3ffd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 560
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-097bdc1d-353d-4efd-9066-59811a9d3ffd"}
```

## 12. DELETE /v1/accounts/me

```text
#12 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e678f718-750c-4fee-b4ed-a0f2ec3a8528

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e678f718-750c-4fee-b4ed-a0f2ec3a8528
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e678f718-750c-4fee-b4ed-a0f2ec3a8528
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 54
RateLimit-Reset: 10
X-Served-Region: eu
```

## 13. POST /v1/auth/token

```text
#13 POST http://localhost:7070/v1/auth/token
correlation: qa-28776c09-ab93-4766-98eb-41c195c01c22

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-28776c09-ab93-4766-98eb-41c195c01c22
Content-Type: application/json

--- request body ---
{"handle":"qa-99530420c027","password":"****"}

--- response: 401 in 3 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-28776c09-ab93-4766-98eb-41c195c01c22
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-28776c09-ab93-4766-98eb-41c195c01c22"}
```
