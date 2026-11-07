# Transcript: Past its rate limit, a token gets a 429 problem from every operation

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#pastTheLimitEveryOperationIsA429` |
| Features | FEAT-RATE-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 102 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 37 | `qa-65813918-25ab-443b-9f67-346e13fb5e5e` |
| 2 | `POST /v1/accounts` | 201 | 28 | `qa-b16c4628-5734-48f7-bace-28f415ceb45b` |
| 3 | `POST /v1/auth/token` | 200 | 27 | `qa-35853aac-b72b-4865-a03b-2e8f02127401` |
| 4 | `POST /v1/conversations` | 201 | 29 | `qa-204556e5-4115-4312-948b-25abd459f838` |
| 5 | `GET /v1/accounts/me` | 200 | 19 | `qa-1228b710-d446-4f4f-83aa-ba480864c3a4` |
| 6 | `GET /v1/accounts/me` | 200 | 20 | `qa-08fba2a8-1876-4fbe-9ec5-43cf0abf1a4e` |
| 7 | `GET /v1/accounts/me` | 200 | 15 | `qa-a18b0d79-aa4f-426f-827c-b72fb77b3df3` |
| 8 | `GET /v1/accounts/me` | 200 | 20 | `qa-3d1685ac-d2f3-414f-b83b-44073b7b3b27` |
| 9 | `GET /v1/accounts/me` | 200 | 16 | `qa-a63db930-987e-44c1-b5de-73dea35f0af3` |
| 10 | `GET /v1/accounts/me` | 200 | 24 | `qa-7d4dfdae-c76f-4cb7-bd6e-0c50537a4c3b` |
| 11 | `GET /v1/accounts/me` | 200 | 15 | `qa-8d2e6abe-dca5-41d6-b838-db7e8b9a7ec0` |
| 12 | `GET /v1/accounts/me` | 200 | 27 | `qa-f2c56477-dfe5-46f4-ab1c-3789c9ad0297` |
| 13 | `GET /v1/accounts/me` | 200 | 19 | `qa-7a6e1919-1e62-4366-9ec5-3b0d16d60e1b` |
| 14 | `GET /v1/accounts/me` | 200 | 16 | `qa-33c9aba1-f7fa-4747-9fad-6f4be2728b7b` |
| 15 | `GET /v1/accounts/me` | 200 | 13 | `qa-c8f7c287-518b-4b15-80ca-202350ed04c0` |
| 16 | `GET /v1/accounts/me` | 200 | 17 | `qa-577b49a1-2de4-4579-82fb-6e81a7b6841c` |
| 17 | `GET /v1/accounts/me` | 200 | 33 | `qa-c03aa4dc-09fc-4456-823b-fa8e2016dbfc` |
| 18 | `GET /v1/accounts/me` | 200 | 19 | `qa-fd28a002-b400-49e4-aa4a-2b07c452ce06` |
| 19 | `GET /v1/accounts/me` | 200 | 15 | `qa-9ba5c6c7-8e76-4c0b-ace5-66ffb68a39bd` |
| 20 | `GET /v1/accounts/me` | 200 | 11 | `qa-cea153bc-531b-4786-bc00-e3fbbfb5ee53` |
| 21 | `GET /v1/accounts/me` | 200 | 17 | `qa-916a7b2e-a109-4695-86d5-d10ab6f20056` |
| 22 | `GET /v1/accounts/me` | 200 | 27 | `qa-47e93ec2-2a0d-4ceb-bd1e-f26cc1e6c27e` |
| 23 | `GET /v1/accounts/me` | 200 | 19 | `qa-b53be304-55e3-4cc5-b233-ecc30941d812` |
| 24 | `GET /v1/accounts/me` | 200 | 12 | `qa-69c567b4-b493-4197-89bb-c9cf47432ef3` |
| 25 | `GET /v1/accounts/me` | 200 | 11 | `qa-247825c2-50e6-4f55-98f6-e4fcfb8faee2` |
| 26 | `GET /v1/accounts/me` | 200 | 10 | `qa-0c578e30-d660-42ff-a798-2a038bac6ce2` |
| 27 | `GET /v1/accounts/me` | 200 | 12 | `qa-c3670d19-488e-4aaa-bd9e-4ca6d33e0e2b` |
| 28 | `GET /v1/accounts/me` | 200 | 28 | `qa-adbfcd53-1882-476d-bf77-86b77756f894` |
| 29 | `GET /v1/accounts/me` | 200 | 22 | `qa-a411b96f-ae62-4b2c-9990-5941e08e2b67` |
| 30 | `GET /v1/accounts/me` | 200 | 9 | `qa-420abd2d-9fa7-450f-ac62-6707942aaee7` |
| 31 | `GET /v1/accounts/me` | 200 | 8 | `qa-bcfb6ea2-700d-4a64-9d91-f12245cbd794` |
| 32 | `GET /v1/accounts/me` | 200 | 12 | `qa-c7b75514-8668-4bd3-9d7f-30c2fcaf9e7b` |
| 33 | `GET /v1/accounts/me` | 200 | 15 | `qa-7614a4db-306d-4d40-8b31-ffdd027cd697` |
| 34 | `GET /v1/accounts/me` | 200 | 12 | `qa-06a264b7-c3dd-41c6-bf4f-6f6cc36d1585` |
| 35 | `GET /v1/accounts/me` | 200 | 10 | `qa-4b065df2-5b82-4e6e-a8e9-991f9a6b5a76` |
| 36 | `GET /v1/accounts/me` | 200 | 12 | `qa-8dd6e68d-7f36-4090-8ba0-bb4a58be43a0` |
| 37 | `GET /v1/accounts/me` | 200 | 9 | `qa-7666255b-d2dd-4e47-850d-b8d037a11593` |
| 38 | `GET /v1/accounts/me` | 200 | 6 | `qa-befbf7eb-19f3-4dfa-aab4-e50ba9ed60c6` |
| 39 | `GET /v1/accounts/me` | 200 | 13 | `qa-4f0052d8-8234-4dc3-bf40-6202eadc91f5` |
| 40 | `GET /v1/accounts/me` | 200 | 3 | `qa-e969228a-dda4-48d9-a11b-2e2521c66759` |
| 41 | `GET /v1/accounts/me` | 200 | 22 | `qa-022177e8-5922-4792-a808-58587ec4c7be` |
| 42 | `GET /v1/accounts/me` | 200 | 24 | `qa-bc9785a6-91bf-4aa2-ad35-2b1884233e43` |
| 43 | `GET /v1/accounts/me` | 200 | 13 | `qa-6c5cb89a-92b3-44f7-9fc5-1a7b5e8775b3` |
| 44 | `GET /v1/accounts/me` | 200 | 9 | `qa-700c85b8-a0b7-4d1f-9c18-311cde5c79de` |
| 45 | `GET /v1/accounts/me` | 200 | 4 | `qa-49bea445-2590-450b-9514-f3bacff3e56a` |
| 46 | `GET /v1/accounts/me` | 200 | 7 | `qa-c628423e-a539-4f6b-9ffc-710ce5d4143c` |
| 47 | `GET /v1/accounts/me` | 200 | 13 | `qa-2bb12aae-6383-44bd-ba0d-b81ed20e4282` |
| 48 | `GET /v1/accounts/me` | 200 | 23 | `qa-cf581cf0-da7c-4166-8954-c801b90fa010` |
| 49 | `GET /v1/accounts/me` | 200 | 13 | `qa-27102fe0-4c6c-4a25-abba-14a56e567465` |
| 50 | `GET /v1/accounts/me` | 200 | 10 | `qa-9e0f3cba-3bd2-447d-a118-6f692a951362` |
| 51 | `GET /v1/accounts/me` | 200 | 8 | `qa-f3e2877f-a74a-4d37-be90-e705f963548e` |
| 52 | `GET /v1/accounts/me` | 200 | 14 | `qa-9a239400-785d-4cfa-ab59-237b5519c3c7` |
| 53 | `GET /v1/accounts/me` | 200 | 12 | `qa-1a83963e-6835-4c6b-910c-2c5abadef779` |
| 54 | `GET /v1/accounts/me` | 200 | 13 | `qa-a1ffc219-2bb8-4ea9-ad2e-5f98724bf6cd` |
| 55 | `GET /v1/accounts/me` | 200 | 8 | `qa-4c57880c-bdd7-4fa0-b28c-8c9d7b0326c6` |
| 56 | `GET /v1/accounts/me` | 200 | 11 | `qa-5838aae0-e829-4f44-a955-3e16e1861868` |
| 57 | `GET /v1/accounts/me` | 200 | 4 | `qa-c094a4b3-6f39-462e-abe9-1f29e00a7ac7` |
| 58 | `GET /v1/accounts/me` | 200 | 9 | `qa-5d74afa5-f4bf-4899-a0b2-55fba4a39ba6` |
| 59 | `GET /v1/accounts/me` | 200 | 11 | `qa-8a665b74-180e-4747-9ce2-cf2d494236a6` |
| 60 | `GET /v1/accounts/me` | 200 | 6 | `qa-9b659d5e-0a6a-4abf-b302-a9559dc8d099` |
| 61 | `GET /v1/accounts/me` | 200 | 6 | `qa-24ca2610-89c9-46ce-9d1a-41d628c5cb8e` |
| 62 | `GET /v1/accounts/me` | 200 | 6 | `qa-c42b9ee6-5307-4214-a9f5-22e7b7ad273c` |
| 63 | `GET /v1/accounts/me` | 200 | 6 | `qa-d91b84c8-e462-4d89-bc0a-3a8cdec057dd` |
| 64 | `GET /v1/accounts/me` | 429 | 5 | `qa-89ad001b-0d01-46fc-9e13-c2e53b0546de` |
| 65 | `POST /v1/auth/token` | 429 | 12 | `qa-b1c782c1-aad9-43fd-afb2-6dd9efe6c22e` |
| 66 | `POST /v1/accounts` | 429 | 4 | `qa-1d8cc739-8280-45a7-94d5-bbfba4719d0d` |
| 67 | `GET /v1/accounts/me` | 429 | 4 | `qa-3d2c114d-2c1e-4da8-9769-24c905094847` |
| 68 | `PATCH /v1/accounts/me` | 429 | 6 | `qa-728ec01d-a0e4-423f-be13-f2913d60c458` |
| 69 | `DELETE /v1/accounts/me` | 429 | 5 | `qa-08d4cd9e-8b6e-49cb-a1fe-5f736661feb2` |
| 70 | `GET /v1/accounts/{handle}` | 429 | 5 | `qa-01ad4755-d0e3-42d8-b2a1-5bddf58a2e6e` |
| 71 | `POST /v1/conversations` | 429 | 4 | `qa-3931681c-b906-464e-bff4-520ba9ddc46a` |
| 72 | `GET /v1/conversations` | 429 | 4 | `qa-4653407f-0b60-4d0d-966a-210e29a5d3fc` |
| 73 | `GET /v1/conversations/{id}` | 429 | 3 | `qa-1b7eebb6-a117-45ff-8a09-bd405b391811` |
| 74 | `GET /v1/conversations/{id}/messages` | 429 | 4 | `qa-ce0927f6-eac5-457c-a265-8a3033d81a78` |
| 75 | `POST /v1/conversations/{id}/messages` | 429 | 4 | `qa-9262059b-1a00-49ec-bf8b-aea3f56e7524` |
| 76 | `POST /v1/conversations/{id}/read` | 429 | 3 | `qa-c77bb656-e1d8-4424-886e-8df6b1d4f168` |
| 77 | `POST /v1/conversations/{id}/close` | 429 | 4 | `qa-3e21d54b-9d8e-4f39-87b7-fa744e7231da` |
| 78 | `GET /v1/credits/balance` | 429 | 4 | `qa-11bbe87c-be62-44e9-aaa4-97b479e30c87` |
| 79 | `GET /v1/credits/ledger` | 429 | 4 | `qa-69675fa7-6ed7-4efe-b287-a99cfd497db6` |
| 80 | `POST /v1/credits/purchases` | 429 | 3 | `qa-c9e54310-430d-43b4-a75b-18032fbdb59b` |
| 81 | `GET /v1/admin/stats` | 429 | 3 | `qa-9066d4c9-66fa-4968-9612-e518db696b6d` |
| 82 | `GET /v1/accounts/me` | 429 | 3 | `qa-b21121ce-7386-401a-a797-889c0e848cae` |
| 83 | `GET /v1/accounts/me` | 429 | 3 | `qa-4d652673-5468-4018-8b4b-60d574a1f746` |
| 84 | `GET /v1/accounts/me` | 429 | 3 | `qa-b4c36506-3076-4c4b-83ca-bb2019e3f946` |
| 85 | `GET /v1/accounts/me` | 429 | 3 | `qa-cff18b7d-7852-4102-aed4-08a7c23ad830` |
| 86 | `GET /v1/accounts/me` | 429 | 3 | `qa-02eb685d-ba24-4950-8248-cc4c79d3f5b1` |
| 87 | `GET /v1/accounts/me` | 429 | 3 | `qa-68259b68-9909-489a-98a3-d996844b06a3` |
| 88 | `GET /v1/accounts/me` | 429 | 3 | `qa-2dfcac78-3d99-4dff-8417-a4b89a85fdc0` |
| 89 | `GET /v1/accounts/me` | 429 | 3 | `qa-69803c84-1fc8-4f41-a836-b49df4ba7f8a` |
| 90 | `GET /v1/accounts/me` | 429 | 3 | `qa-49b4c76a-13bd-4b72-970d-0cb741fbad9e` |
| 91 | `GET /v1/accounts/me` | 429 | 3 | `qa-845adaf9-a092-43f6-be81-d99b448e1b38` |
| 92 | `GET /v1/accounts/me` | 429 | 3 | `qa-4166de5e-65d4-4161-bd90-a1f11930c97f` |
| 93 | `GET /v1/accounts/me` | 429 | 4 | `qa-522d97f2-5551-43c1-b373-599a0d820388` |
| 94 | `GET /v1/accounts/me` | 429 | 3 | `qa-455485cb-c5c1-47d6-a4d3-c9a136f832e9` |
| 95 | `GET /v1/accounts/me` | 429 | 3 | `qa-c527881f-7511-42dd-b3b3-52f49ac147d2` |
| 96 | `GET /v1/accounts/me` | 429 | 5 | `qa-6f12ad5a-9cce-4ca7-b60c-c97795bfd1dd` |
| 97 | `GET /v1/accounts/me` | 200 | 6 | `qa-2512b0e7-0fe2-4ccb-af24-a866cd2d63d5` |
| 98 | `POST /v1/auth/token` | 200 | 7 | `qa-4b2df32f-85e2-4de4-9c04-2795d73203b9` |
| 99 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-241a7858-cb48-488c-a09b-18dc3f9ce4c0` |
| 100 | `POST /v1/auth/token` | 401 | 5 | `qa-d9848246-b6ff-42a6-b129-02a6989fcc86` |
| 101 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-f9b6f8d4-17e5-4dc5-b0d0-0b847b6b0e61` |
| 102 | `POST /v1/auth/token` | 401 | 6 | `qa-530b85a9-64ee-4de5-a849-718ec5b64d44` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-65813918-25ab-443b-9f67-346e13fb5e5e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-65813918-25ab-443b-9f67-346e13fb5e5e
Content-Type: application/json

--- request body ---
{"handle":"qa-32ba73501279","displayName":"QA 32ba73501279","password":"****","region":"eu"}

--- response: 201 in 37 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-65813918-25ab-443b-9f67-346e13fb5e5e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 442
RateLimit-Reset: 8
Location: /v1/accounts/qa-32ba73501279
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3237644-1730-446c-a459-17fb77acbe8c","handle":"qa-32ba73501279","displayName":"QA 32ba73501279","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.767726033Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-b16c4628-5734-48f7-bace-28f415ceb45b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b16c4628-5734-48f7-bace-28f415ceb45b
Content-Type: application/json

--- request body ---
{"handle":"qa-1abcb3100109","displayName":"QA 1abcb3100109","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-b16c4628-5734-48f7-bace-28f415ceb45b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 431
RateLimit-Reset: 8
Location: /v1/accounts/qa-1abcb3100109
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3556ce5a-104c-41d2-93b4-ffc623fa8ab7","handle":"qa-1abcb3100109","displayName":"QA 1abcb3100109","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.810326816Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-35853aac-b72b-4865-a03b-2e8f02127401

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35853aac-b72b-4865-a03b-2e8f02127401
Content-Type: application/json

--- request body ---
{"handle":"qa-32ba73501279","password":"****"}

--- response: 200 in 27 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-35853aac-b72b-4865-a03b-2e8f02127401
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 418
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a3237644-1730-446c-a459-17fb77acbe8c"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-204556e5-4115-4312-948b-25abd459f838

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-204556e5-4115-4312-948b-25abd459f838
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-1abcb3100109","subject":"Error contract","message":"Hi"}

--- response: 201 in 29 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-204556e5-4115-4312-948b-25abd459f838
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
Location: /v1/conversations/cnv_25b90d8b-6d79-4725-af97-15f7ccc6dcaf
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_25b90d8b-6d79-4725-af97-15f7ccc6dcaf","subject":"Error contract","status":"open","region":"eu","participants":["qa-32ba73501279","qa-1abcb3100109"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-02T09:38:36.914868292Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-1228b710-d446-4f4f-83aa-ba480864c3a4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1228b710-d446-4f4f-83aa-ba480864c3a4
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-1228b710-d446-4f4f-83aa-ba480864c3a4
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
Content-Length: 181

{"id":"acc_a3237644-1730-446c-a459-17fb77acbe8c","handle":"qa-32ba73501279","displayName":"QA 32ba73501279","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.767726033Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-08fba2a8-1876-4fbe-9ec5-43cf0abf1a4e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08fba2a8-1876-4fbe-9ec5-43cf0abf1a4e
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-08fba2a8-1876-4fbe-9ec5-43cf0abf1a4e
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
Content-Length: 181

{"id":"acc_a3237644-1730-446c-a459-17fb77acbe8c","handle":"qa-32ba73501279","displayName":"QA 32ba73501279","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.767726033Z"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-a18b0d79-aa4f-426f-827c-b72fb77b3df3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a18b0d79-aa4f-426f-827c-b72fb77b3df3
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-a18b0d79-aa4f-426f-827c-b72fb77b3df3
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
Content-Length: 181

{"id":"acc_a3237644-1730-446c-a459-17fb77acbe8c","handle":"qa-32ba73501279","displayName":"QA 32ba73501279","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.767726033Z"}
```

## 8. GET /v1/accounts/me

```text
#8 GET http://localhost:7070/v1/accounts/me
correlation: qa-3d1685ac-d2f3-414f-b83b-44073b7b3b27

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d1685ac-d2f3-414f-b83b-44073b7b3b27
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-3d1685ac-d2f3-414f-b83b-44073b7b3b27
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
Content-Length: 181

{"id":"acc_a3237644-1730-446c-a459-17fb77acbe8c","handle":"qa-32ba73501279","displayName":"QA 32ba73501279","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.767726033Z"}
```

## 9. GET /v1/accounts/me

```text
#9 GET http://localhost:7070/v1/accounts/me
correlation: qa-a63db930-987e-44c1-b5de-73dea35f0af3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a63db930-987e-44c1-b5de-73dea35f0af3
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-a63db930-987e-44c1-b5de-73dea35f0af3
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
Content-Length: 181

{"id":"acc_a3237644-1730-446c-a459-17fb77acbe8c","handle":"qa-32ba73501279","displayName":"QA 32ba73501279","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.767726033Z"}
```

## 10. GET /v1/accounts/me

```text
#10 GET http://localhost:7070/v1/accounts/me
correlation: qa-7d4dfdae-c76f-4cb7-bd6e-0c50537a4c3b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7d4dfdae-c76f-4cb7-bd6e-0c50537a4c3b
Content-Type: application/json

--- response: 200 in 24 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-7d4dfdae-c76f-4cb7-bd6e-0c50537a4c3b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 53
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3237644-1730-446c-a459-17fb77acbe8c","handle":"qa-32ba73501279","displayName":"QA 32ba73501279","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.767726033Z"}
```

## 11. GET /v1/accounts/me

```text
#11 GET http://localhost:7070/v1/accounts/me
correlation: qa-8d2e6abe-dca5-41d6-b838-db7e8b9a7ec0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8d2e6abe-dca5-41d6-b838-db7e8b9a7ec0
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-8d2e6abe-dca5-41d6-b838-db7e8b9a7ec0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 52
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3237644-1730-446c-a459-17fb77acbe8c","handle":"qa-32ba73501279","displayName":"QA 32ba73501279","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.767726033Z"}
```

## 12. GET /v1/accounts/me

```text
#12 GET http://localhost:7070/v1/accounts/me
correlation: qa-f2c56477-dfe5-46f4-ab1c-3789c9ad0297

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f2c56477-dfe5-46f4-ab1c-3789c9ad0297
Content-Type: application/json

--- response: 200 in 27 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-f2c56477-dfe5-46f4-ab1c-3789c9ad0297
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 51
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3237644-1730-446c-a459-17fb77acbe8c","handle":"qa-32ba73501279","displayName":"QA 32ba73501279","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.767726033Z"}
```

## 13. GET /v1/accounts/me

```text
#13 GET http://localhost:7070/v1/accounts/me
correlation: qa-7a6e1919-1e62-4366-9ec5-3b0d16d60e1b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7a6e1919-1e62-4366-9ec5-3b0d16d60e1b
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-7a6e1919-1e62-4366-9ec5-3b0d16d60e1b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 50
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3237644-1730-446c-a459-17fb77acbe8c","handle":"qa-32ba73501279","displayName":"QA 32ba73501279","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.767726033Z"}
```

## 14. GET /v1/accounts/me

```text
#14 GET http://localhost:7070/v1/accounts/me
correlation: qa-33c9aba1-f7fa-4747-9fad-6f4be2728b7b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-33c9aba1-f7fa-4747-9fad-6f4be2728b7b
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-33c9aba1-f7fa-4747-9fad-6f4be2728b7b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 49
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3237644-1730-446c-a459-17fb77acbe8c","handle":"qa-32ba73501279","displayName":"QA 32ba73501279","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.767726033Z"}
```

## 15. GET /v1/accounts/me

```text
#15 GET http://localhost:7070/v1/accounts/me
correlation: qa-c8f7c287-518b-4b15-80ca-202350ed04c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c8f7c287-518b-4b15-80ca-202350ed04c0
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-c8f7c287-518b-4b15-80ca-202350ed04c0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 48
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3237644-1730-446c-a459-17fb77acbe8c","handle":"qa-32ba73501279","displayName":"QA 32ba73501279","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.767726033Z"}
```

## 16. GET /v1/accounts/me

```text
#16 GET http://localhost:7070/v1/accounts/me
correlation: qa-577b49a1-2de4-4579-82fb-6e81a7b6841c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-577b49a1-2de4-4579-82fb-6e81a7b6841c
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-577b49a1-2de4-4579-82fb-6e81a7b6841c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 47
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3237644-1730-446c-a459-17fb77acbe8c","handle":"qa-32ba73501279","displayName":"QA 32ba73501279","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.767726033Z"}
```

## 17. GET /v1/accounts/me

```text
#17 GET http://localhost:7070/v1/accounts/me
correlation: qa-c03aa4dc-09fc-4456-823b-fa8e2016dbfc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c03aa4dc-09fc-4456-823b-fa8e2016dbfc
Content-Type: application/json

--- response: 200 in 33 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-c03aa4dc-09fc-4456-823b-fa8e2016dbfc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 46
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3237644-1730-446c-a459-17fb77acbe8c","handle":"qa-32ba73501279","displayName":"QA 32ba73501279","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.767726033Z"}
```

## 18. GET /v1/accounts/me

```text
#18 GET http://localhost:7070/v1/accounts/me
correlation: qa-fd28a002-b400-49e4-aa4a-2b07c452ce06

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd28a002-b400-49e4-aa4a-2b07c452ce06
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-fd28a002-b400-49e4-aa4a-2b07c452ce06
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 45
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3237644-1730-446c-a459-17fb77acbe8c","handle":"qa-32ba73501279","displayName":"QA 32ba73501279","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.767726033Z"}
```

## 19. GET /v1/accounts/me

```text
#19 GET http://localhost:7070/v1/accounts/me
correlation: qa-9ba5c6c7-8e76-4c0b-ace5-66ffb68a39bd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ba5c6c7-8e76-4c0b-ace5-66ffb68a39bd
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-9ba5c6c7-8e76-4c0b-ace5-66ffb68a39bd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 44
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3237644-1730-446c-a459-17fb77acbe8c","handle":"qa-32ba73501279","displayName":"QA 32ba73501279","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.767726033Z"}
```

## 20. GET /v1/accounts/me

```text
#20 GET http://localhost:7070/v1/accounts/me
correlation: qa-cea153bc-531b-4786-bc00-e3fbbfb5ee53

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cea153bc-531b-4786-bc00-e3fbbfb5ee53
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-cea153bc-531b-4786-bc00-e3fbbfb5ee53
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 43
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3237644-1730-446c-a459-17fb77acbe8c","handle":"qa-32ba73501279","displayName":"QA 32ba73501279","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.767726033Z"}
```

## 21. GET /v1/accounts/me

```text
#21 GET http://localhost:7070/v1/accounts/me
correlation: qa-916a7b2e-a109-4695-86d5-d10ab6f20056

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-916a7b2e-a109-4695-86d5-d10ab6f20056
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-916a7b2e-a109-4695-86d5-d10ab6f20056
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 42
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3237644-1730-446c-a459-17fb77acbe8c","handle":"qa-32ba73501279","displayName":"QA 32ba73501279","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.767726033Z"}
```

## 22. GET /v1/accounts/me

```text
#22 GET http://localhost:7070/v1/accounts/me
correlation: qa-47e93ec2-2a0d-4ceb-bd1e-f26cc1e6c27e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-47e93ec2-2a0d-4ceb-bd1e-f26cc1e6c27e
Content-Type: application/json

--- response: 200 in 27 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-47e93ec2-2a0d-4ceb-bd1e-f26cc1e6c27e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 41
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3237644-1730-446c-a459-17fb77acbe8c","handle":"qa-32ba73501279","displayName":"QA 32ba73501279","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.767726033Z"}
```

## 23. GET /v1/accounts/me

```text
#23 GET http://localhost:7070/v1/accounts/me
correlation: qa-b53be304-55e3-4cc5-b233-ecc30941d812

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b53be304-55e3-4cc5-b233-ecc30941d812
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-b53be304-55e3-4cc5-b233-ecc30941d812
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 40
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3237644-1730-446c-a459-17fb77acbe8c","handle":"qa-32ba73501279","displayName":"QA 32ba73501279","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.767726033Z"}
```

## 24. GET /v1/accounts/me

```text
#24 GET http://localhost:7070/v1/accounts/me
correlation: qa-69c567b4-b493-4197-89bb-c9cf47432ef3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-69c567b4-b493-4197-89bb-c9cf47432ef3
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-69c567b4-b493-4197-89bb-c9cf47432ef3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 39
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3237644-1730-446c-a459-17fb77acbe8c","handle":"qa-32ba73501279","displayName":"QA 32ba73501279","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.767726033Z"}
```

## 25. GET /v1/accounts/me

```text
#25 GET http://localhost:7070/v1/accounts/me
correlation: qa-247825c2-50e6-4f55-98f6-e4fcfb8faee2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-247825c2-50e6-4f55-98f6-e4fcfb8faee2
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-247825c2-50e6-4f55-98f6-e4fcfb8faee2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 38
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3237644-1730-446c-a459-17fb77acbe8c","handle":"qa-32ba73501279","displayName":"QA 32ba73501279","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.767726033Z"}
```

## 26. GET /v1/accounts/me

```text
#26 GET http://localhost:7070/v1/accounts/me
correlation: qa-0c578e30-d660-42ff-a798-2a038bac6ce2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0c578e30-d660-42ff-a798-2a038bac6ce2
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-0c578e30-d660-42ff-a798-2a038bac6ce2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 37
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3237644-1730-446c-a459-17fb77acbe8c","handle":"qa-32ba73501279","displayName":"QA 32ba73501279","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.767726033Z"}
```

## 27. GET /v1/accounts/me

```text
#27 GET http://localhost:7070/v1/accounts/me
correlation: qa-c3670d19-488e-4aaa-bd9e-4ca6d33e0e2b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c3670d19-488e-4aaa-bd9e-4ca6d33e0e2b
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-c3670d19-488e-4aaa-bd9e-4ca6d33e0e2b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 36
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3237644-1730-446c-a459-17fb77acbe8c","handle":"qa-32ba73501279","displayName":"QA 32ba73501279","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.767726033Z"}
```

## 28. GET /v1/accounts/me

```text
#28 GET http://localhost:7070/v1/accounts/me
correlation: qa-adbfcd53-1882-476d-bf77-86b77756f894

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-adbfcd53-1882-476d-bf77-86b77756f894
Content-Type: application/json

--- response: 200 in 28 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-adbfcd53-1882-476d-bf77-86b77756f894
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 35
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3237644-1730-446c-a459-17fb77acbe8c","handle":"qa-32ba73501279","displayName":"QA 32ba73501279","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.767726033Z"}
```

## 29. GET /v1/accounts/me

```text
#29 GET http://localhost:7070/v1/accounts/me
correlation: qa-a411b96f-ae62-4b2c-9990-5941e08e2b67

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a411b96f-ae62-4b2c-9990-5941e08e2b67
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-a411b96f-ae62-4b2c-9990-5941e08e2b67
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 34
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3237644-1730-446c-a459-17fb77acbe8c","handle":"qa-32ba73501279","displayName":"QA 32ba73501279","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.767726033Z"}
```

## 30. GET /v1/accounts/me

```text
#30 GET http://localhost:7070/v1/accounts/me
correlation: qa-420abd2d-9fa7-450f-ac62-6707942aaee7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-420abd2d-9fa7-450f-ac62-6707942aaee7
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-420abd2d-9fa7-450f-ac62-6707942aaee7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 33
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3237644-1730-446c-a459-17fb77acbe8c","handle":"qa-32ba73501279","displayName":"QA 32ba73501279","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.767726033Z"}
```

## 31. GET /v1/accounts/me

```text
#31 GET http://localhost:7070/v1/accounts/me
correlation: qa-bcfb6ea2-700d-4a64-9d91-f12245cbd794

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bcfb6ea2-700d-4a64-9d91-f12245cbd794
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-bcfb6ea2-700d-4a64-9d91-f12245cbd794
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 32
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3237644-1730-446c-a459-17fb77acbe8c","handle":"qa-32ba73501279","displayName":"QA 32ba73501279","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.767726033Z"}
```

## 32. GET /v1/accounts/me

```text
#32 GET http://localhost:7070/v1/accounts/me
correlation: qa-c7b75514-8668-4bd3-9d7f-30c2fcaf9e7b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c7b75514-8668-4bd3-9d7f-30c2fcaf9e7b
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-c7b75514-8668-4bd3-9d7f-30c2fcaf9e7b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 31
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3237644-1730-446c-a459-17fb77acbe8c","handle":"qa-32ba73501279","displayName":"QA 32ba73501279","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.767726033Z"}
```

## 33. GET /v1/accounts/me

```text
#33 GET http://localhost:7070/v1/accounts/me
correlation: qa-7614a4db-306d-4d40-8b31-ffdd027cd697

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7614a4db-306d-4d40-8b31-ffdd027cd697
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-7614a4db-306d-4d40-8b31-ffdd027cd697
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 30
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3237644-1730-446c-a459-17fb77acbe8c","handle":"qa-32ba73501279","displayName":"QA 32ba73501279","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.767726033Z"}
```

## 34. GET /v1/accounts/me

```text
#34 GET http://localhost:7070/v1/accounts/me
correlation: qa-06a264b7-c3dd-41c6-bf4f-6f6cc36d1585

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-06a264b7-c3dd-41c6-bf4f-6f6cc36d1585
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-06a264b7-c3dd-41c6-bf4f-6f6cc36d1585
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 29
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3237644-1730-446c-a459-17fb77acbe8c","handle":"qa-32ba73501279","displayName":"QA 32ba73501279","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.767726033Z"}
```

## 35. GET /v1/accounts/me

```text
#35 GET http://localhost:7070/v1/accounts/me
correlation: qa-4b065df2-5b82-4e6e-a8e9-991f9a6b5a76

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4b065df2-5b82-4e6e-a8e9-991f9a6b5a76
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-4b065df2-5b82-4e6e-a8e9-991f9a6b5a76
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 28
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3237644-1730-446c-a459-17fb77acbe8c","handle":"qa-32ba73501279","displayName":"QA 32ba73501279","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.767726033Z"}
```

## 36. GET /v1/accounts/me

```text
#36 GET http://localhost:7070/v1/accounts/me
correlation: qa-8dd6e68d-7f36-4090-8ba0-bb4a58be43a0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8dd6e68d-7f36-4090-8ba0-bb4a58be43a0
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-8dd6e68d-7f36-4090-8ba0-bb4a58be43a0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 27
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3237644-1730-446c-a459-17fb77acbe8c","handle":"qa-32ba73501279","displayName":"QA 32ba73501279","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.767726033Z"}
```

## 37. GET /v1/accounts/me

```text
#37 GET http://localhost:7070/v1/accounts/me
correlation: qa-7666255b-d2dd-4e47-850d-b8d037a11593

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7666255b-d2dd-4e47-850d-b8d037a11593
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-7666255b-d2dd-4e47-850d-b8d037a11593
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 26
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3237644-1730-446c-a459-17fb77acbe8c","handle":"qa-32ba73501279","displayName":"QA 32ba73501279","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.767726033Z"}
```

## 38. GET /v1/accounts/me

```text
#38 GET http://localhost:7070/v1/accounts/me
correlation: qa-befbf7eb-19f3-4dfa-aab4-e50ba9ed60c6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-befbf7eb-19f3-4dfa-aab4-e50ba9ed60c6
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-befbf7eb-19f3-4dfa-aab4-e50ba9ed60c6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 25
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3237644-1730-446c-a459-17fb77acbe8c","handle":"qa-32ba73501279","displayName":"QA 32ba73501279","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.767726033Z"}
```

## 39. GET /v1/accounts/me

```text
#39 GET http://localhost:7070/v1/accounts/me
correlation: qa-4f0052d8-8234-4dc3-bf40-6202eadc91f5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4f0052d8-8234-4dc3-bf40-6202eadc91f5
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-4f0052d8-8234-4dc3-bf40-6202eadc91f5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 24
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3237644-1730-446c-a459-17fb77acbe8c","handle":"qa-32ba73501279","displayName":"QA 32ba73501279","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.767726033Z"}
```

## 40. GET /v1/accounts/me

```text
#40 GET http://localhost:7070/v1/accounts/me
correlation: qa-e969228a-dda4-48d9-a11b-2e2521c66759

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e969228a-dda4-48d9-a11b-2e2521c66759
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-e969228a-dda4-48d9-a11b-2e2521c66759
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 23
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3237644-1730-446c-a459-17fb77acbe8c","handle":"qa-32ba73501279","displayName":"QA 32ba73501279","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.767726033Z"}
```

## 41. GET /v1/accounts/me

```text
#41 GET http://localhost:7070/v1/accounts/me
correlation: qa-022177e8-5922-4792-a808-58587ec4c7be

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-022177e8-5922-4792-a808-58587ec4c7be
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-022177e8-5922-4792-a808-58587ec4c7be
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 22
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3237644-1730-446c-a459-17fb77acbe8c","handle":"qa-32ba73501279","displayName":"QA 32ba73501279","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.767726033Z"}
```

## 42. GET /v1/accounts/me

```text
#42 GET http://localhost:7070/v1/accounts/me
correlation: qa-bc9785a6-91bf-4aa2-ad35-2b1884233e43

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bc9785a6-91bf-4aa2-ad35-2b1884233e43
Content-Type: application/json

--- response: 200 in 24 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-bc9785a6-91bf-4aa2-ad35-2b1884233e43
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 21
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3237644-1730-446c-a459-17fb77acbe8c","handle":"qa-32ba73501279","displayName":"QA 32ba73501279","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.767726033Z"}
```

## 43. GET /v1/accounts/me

```text
#43 GET http://localhost:7070/v1/accounts/me
correlation: qa-6c5cb89a-92b3-44f7-9fc5-1a7b5e8775b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6c5cb89a-92b3-44f7-9fc5-1a7b5e8775b3
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-6c5cb89a-92b3-44f7-9fc5-1a7b5e8775b3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 20
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3237644-1730-446c-a459-17fb77acbe8c","handle":"qa-32ba73501279","displayName":"QA 32ba73501279","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.767726033Z"}
```

## 44. GET /v1/accounts/me

```text
#44 GET http://localhost:7070/v1/accounts/me
correlation: qa-700c85b8-a0b7-4d1f-9c18-311cde5c79de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-700c85b8-a0b7-4d1f-9c18-311cde5c79de
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-700c85b8-a0b7-4d1f-9c18-311cde5c79de
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 19
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3237644-1730-446c-a459-17fb77acbe8c","handle":"qa-32ba73501279","displayName":"QA 32ba73501279","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.767726033Z"}
```

## 45. GET /v1/accounts/me

```text
#45 GET http://localhost:7070/v1/accounts/me
correlation: qa-49bea445-2590-450b-9514-f3bacff3e56a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-49bea445-2590-450b-9514-f3bacff3e56a
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-49bea445-2590-450b-9514-f3bacff3e56a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 18
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3237644-1730-446c-a459-17fb77acbe8c","handle":"qa-32ba73501279","displayName":"QA 32ba73501279","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.767726033Z"}
```

## 46. GET /v1/accounts/me

```text
#46 GET http://localhost:7070/v1/accounts/me
correlation: qa-c628423e-a539-4f6b-9ffc-710ce5d4143c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c628423e-a539-4f6b-9ffc-710ce5d4143c
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-c628423e-a539-4f6b-9ffc-710ce5d4143c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 17
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3237644-1730-446c-a459-17fb77acbe8c","handle":"qa-32ba73501279","displayName":"QA 32ba73501279","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.767726033Z"}
```

## 47. GET /v1/accounts/me

```text
#47 GET http://localhost:7070/v1/accounts/me
correlation: qa-2bb12aae-6383-44bd-ba0d-b81ed20e4282

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2bb12aae-6383-44bd-ba0d-b81ed20e4282
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-2bb12aae-6383-44bd-ba0d-b81ed20e4282
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 16
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3237644-1730-446c-a459-17fb77acbe8c","handle":"qa-32ba73501279","displayName":"QA 32ba73501279","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.767726033Z"}
```

## 48. GET /v1/accounts/me

```text
#48 GET http://localhost:7070/v1/accounts/me
correlation: qa-cf581cf0-da7c-4166-8954-c801b90fa010

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cf581cf0-da7c-4166-8954-c801b90fa010
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-cf581cf0-da7c-4166-8954-c801b90fa010
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 15
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3237644-1730-446c-a459-17fb77acbe8c","handle":"qa-32ba73501279","displayName":"QA 32ba73501279","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.767726033Z"}
```

## 49. GET /v1/accounts/me

```text
#49 GET http://localhost:7070/v1/accounts/me
correlation: qa-27102fe0-4c6c-4a25-abba-14a56e567465

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-27102fe0-4c6c-4a25-abba-14a56e567465
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-27102fe0-4c6c-4a25-abba-14a56e567465
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 14
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3237644-1730-446c-a459-17fb77acbe8c","handle":"qa-32ba73501279","displayName":"QA 32ba73501279","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.767726033Z"}
```

## 50. GET /v1/accounts/me

```text
#50 GET http://localhost:7070/v1/accounts/me
correlation: qa-9e0f3cba-3bd2-447d-a118-6f692a951362

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9e0f3cba-3bd2-447d-a118-6f692a951362
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-9e0f3cba-3bd2-447d-a118-6f692a951362
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 13
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3237644-1730-446c-a459-17fb77acbe8c","handle":"qa-32ba73501279","displayName":"QA 32ba73501279","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.767726033Z"}
```

## 51. GET /v1/accounts/me

```text
#51 GET http://localhost:7070/v1/accounts/me
correlation: qa-f3e2877f-a74a-4d37-be90-e705f963548e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f3e2877f-a74a-4d37-be90-e705f963548e
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-f3e2877f-a74a-4d37-be90-e705f963548e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 12
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3237644-1730-446c-a459-17fb77acbe8c","handle":"qa-32ba73501279","displayName":"QA 32ba73501279","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.767726033Z"}
```

## 52. GET /v1/accounts/me

```text
#52 GET http://localhost:7070/v1/accounts/me
correlation: qa-9a239400-785d-4cfa-ab59-237b5519c3c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9a239400-785d-4cfa-ab59-237b5519c3c7
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-9a239400-785d-4cfa-ab59-237b5519c3c7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 11
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3237644-1730-446c-a459-17fb77acbe8c","handle":"qa-32ba73501279","displayName":"QA 32ba73501279","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.767726033Z"}
```

## 53. GET /v1/accounts/me

```text
#53 GET http://localhost:7070/v1/accounts/me
correlation: qa-1a83963e-6835-4c6b-910c-2c5abadef779

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1a83963e-6835-4c6b-910c-2c5abadef779
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-1a83963e-6835-4c6b-910c-2c5abadef779
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 10
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3237644-1730-446c-a459-17fb77acbe8c","handle":"qa-32ba73501279","displayName":"QA 32ba73501279","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.767726033Z"}
```

## 54. GET /v1/accounts/me

```text
#54 GET http://localhost:7070/v1/accounts/me
correlation: qa-a1ffc219-2bb8-4ea9-ad2e-5f98724bf6cd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a1ffc219-2bb8-4ea9-ad2e-5f98724bf6cd
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-a1ffc219-2bb8-4ea9-ad2e-5f98724bf6cd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 9
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3237644-1730-446c-a459-17fb77acbe8c","handle":"qa-32ba73501279","displayName":"QA 32ba73501279","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.767726033Z"}
```

## 55. GET /v1/accounts/me

```text
#55 GET http://localhost:7070/v1/accounts/me
correlation: qa-4c57880c-bdd7-4fa0-b28c-8c9d7b0326c6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c57880c-bdd7-4fa0-b28c-8c9d7b0326c6
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-4c57880c-bdd7-4fa0-b28c-8c9d7b0326c6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 8
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3237644-1730-446c-a459-17fb77acbe8c","handle":"qa-32ba73501279","displayName":"QA 32ba73501279","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.767726033Z"}
```

## 56. GET /v1/accounts/me

```text
#56 GET http://localhost:7070/v1/accounts/me
correlation: qa-5838aae0-e829-4f44-a955-3e16e1861868

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5838aae0-e829-4f44-a955-3e16e1861868
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-5838aae0-e829-4f44-a955-3e16e1861868
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 7
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3237644-1730-446c-a459-17fb77acbe8c","handle":"qa-32ba73501279","displayName":"QA 32ba73501279","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.767726033Z"}
```

## 57. GET /v1/accounts/me

```text
#57 GET http://localhost:7070/v1/accounts/me
correlation: qa-c094a4b3-6f39-462e-abe9-1f29e00a7ac7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c094a4b3-6f39-462e-abe9-1f29e00a7ac7
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-c094a4b3-6f39-462e-abe9-1f29e00a7ac7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 6
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3237644-1730-446c-a459-17fb77acbe8c","handle":"qa-32ba73501279","displayName":"QA 32ba73501279","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.767726033Z"}
```

## 58. GET /v1/accounts/me

```text
#58 GET http://localhost:7070/v1/accounts/me
correlation: qa-5d74afa5-f4bf-4899-a0b2-55fba4a39ba6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5d74afa5-f4bf-4899-a0b2-55fba4a39ba6
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-5d74afa5-f4bf-4899-a0b2-55fba4a39ba6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 5
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3237644-1730-446c-a459-17fb77acbe8c","handle":"qa-32ba73501279","displayName":"QA 32ba73501279","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.767726033Z"}
```

## 59. GET /v1/accounts/me

```text
#59 GET http://localhost:7070/v1/accounts/me
correlation: qa-8a665b74-180e-4747-9ce2-cf2d494236a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8a665b74-180e-4747-9ce2-cf2d494236a6
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-8a665b74-180e-4747-9ce2-cf2d494236a6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 4
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3237644-1730-446c-a459-17fb77acbe8c","handle":"qa-32ba73501279","displayName":"QA 32ba73501279","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.767726033Z"}
```

## 60. GET /v1/accounts/me

```text
#60 GET http://localhost:7070/v1/accounts/me
correlation: qa-9b659d5e-0a6a-4abf-b302-a9559dc8d099

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b659d5e-0a6a-4abf-b302-a9559dc8d099
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-9b659d5e-0a6a-4abf-b302-a9559dc8d099
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 3
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3237644-1730-446c-a459-17fb77acbe8c","handle":"qa-32ba73501279","displayName":"QA 32ba73501279","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.767726033Z"}
```

## 61. GET /v1/accounts/me

```text
#61 GET http://localhost:7070/v1/accounts/me
correlation: qa-24ca2610-89c9-46ce-9d1a-41d628c5cb8e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-24ca2610-89c9-46ce-9d1a-41d628c5cb8e
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-24ca2610-89c9-46ce-9d1a-41d628c5cb8e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 2
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3237644-1730-446c-a459-17fb77acbe8c","handle":"qa-32ba73501279","displayName":"QA 32ba73501279","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.767726033Z"}
```

## 62. GET /v1/accounts/me

```text
#62 GET http://localhost:7070/v1/accounts/me
correlation: qa-c42b9ee6-5307-4214-a9f5-22e7b7ad273c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c42b9ee6-5307-4214-a9f5-22e7b7ad273c
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-c42b9ee6-5307-4214-a9f5-22e7b7ad273c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 1
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3237644-1730-446c-a459-17fb77acbe8c","handle":"qa-32ba73501279","displayName":"QA 32ba73501279","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.767726033Z"}
```

## 63. GET /v1/accounts/me

```text
#63 GET http://localhost:7070/v1/accounts/me
correlation: qa-d91b84c8-e462-4d89-bc0a-3a8cdec057dd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d91b84c8-e462-4d89-bc0a-3a8cdec057dd
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-d91b84c8-e462-4d89-bc0a-3a8cdec057dd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3237644-1730-446c-a459-17fb77acbe8c","handle":"qa-32ba73501279","displayName":"QA 32ba73501279","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.767726033Z"}
```

## 64. GET /v1/accounts/me

```text
#64 GET http://localhost:7070/v1/accounts/me
correlation: qa-89ad001b-0d01-46fc-9e13-c2e53b0546de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-89ad001b-0d01-46fc-9e13-c2e53b0546de
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-89ad001b-0d01-46fc-9e13-c2e53b0546de
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-89ad001b-0d01-46fc-9e13-c2e53b0546de"}
```

## 65. POST /v1/auth/token

```text
#65 POST http://localhost:7070/v1/auth/token
correlation: qa-b1c782c1-aad9-43fd-afb2-6dd9efe6c22e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b1c782c1-aad9-43fd-afb2-6dd9efe6c22e
Content-Type: application/json

--- request body ---
{"handle":"qa-32ba73501279","password":"****"}

--- response: 429 in 12 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b1c782c1-aad9-43fd-afb2-6dd9efe6c22e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 240

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/auth/token","correlationId":"qa-b1c782c1-aad9-43fd-afb2-6dd9efe6c22e"}
```

## 66. POST /v1/accounts

```text
#66 POST http://localhost:7070/v1/accounts
correlation: qa-1d8cc739-8280-45a7-94d5-bbfba4719d0d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1d8cc739-8280-45a7-94d5-bbfba4719d0d
Content-Type: application/json

--- request body ---
{"handle":"qa-46e20e9af206","displayName":"QA 46e20e9af206","password":"****","region":"eu"}

--- response: 429 in 4 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1d8cc739-8280-45a7-94d5-bbfba4719d0d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 238

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts","correlationId":"qa-1d8cc739-8280-45a7-94d5-bbfba4719d0d"}
```

## 67. GET /v1/accounts/me

```text
#67 GET http://localhost:7070/v1/accounts/me
correlation: qa-3d2c114d-2c1e-4da8-9769-24c905094847

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d2c114d-2c1e-4da8-9769-24c905094847
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3d2c114d-2c1e-4da8-9769-24c905094847
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-3d2c114d-2c1e-4da8-9769-24c905094847"}
```

## 68. PATCH /v1/accounts/me

```text
#68 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-728ec01d-a0e4-423f-be13-f2913d60c458

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-728ec01d-a0e4-423f-be13-f2913d60c458
Content-Type: application/json

--- request body ---
{"displayName":"Probe"}

--- response: 429 in 6 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-728ec01d-a0e4-423f-be13-f2913d60c458
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-728ec01d-a0e4-423f-be13-f2913d60c458"}
```

## 69. DELETE /v1/accounts/me

```text
#69 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-08d4cd9e-8b6e-49cb-a1fe-5f736661feb2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08d4cd9e-8b6e-49cb-a1fe-5f736661feb2
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-08d4cd9e-8b6e-49cb-a1fe-5f736661feb2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-08d4cd9e-8b6e-49cb-a1fe-5f736661feb2"}
```

## 70. GET /v1/accounts/{handle}

```text
#70 GET http://localhost:7070/v1/accounts/qa-32ba73501279
correlation: qa-01ad4755-d0e3-42d8-b2a1-5bddf58a2e6e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-01ad4755-d0e3-42d8-b2a1-5bddf58a2e6e
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-01ad4755-d0e3-42d8-b2a1-5bddf58a2e6e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 254

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/qa-32ba73501279","correlationId":"qa-01ad4755-d0e3-42d8-b2a1-5bddf58a2e6e"}
```

## 71. POST /v1/conversations

```text
#71 POST http://localhost:7070/v1/conversations
correlation: qa-3931681c-b906-464e-bff4-520ba9ddc46a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3931681c-b906-464e-bff4-520ba9ddc46a
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-32ba73501279","subject":"Probe","message":"Hi"}

--- response: 429 in 4 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3931681c-b906-464e-bff4-520ba9ddc46a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 243

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations","correlationId":"qa-3931681c-b906-464e-bff4-520ba9ddc46a"}
```

## 72. GET /v1/conversations

```text
#72 GET http://localhost:7070/v1/conversations
correlation: qa-4653407f-0b60-4d0d-966a-210e29a5d3fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4653407f-0b60-4d0d-966a-210e29a5d3fc
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4653407f-0b60-4d0d-966a-210e29a5d3fc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 243

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations","correlationId":"qa-4653407f-0b60-4d0d-966a-210e29a5d3fc"}
```

## 73. GET /v1/conversations/{id}

```text
#73 GET http://localhost:7070/v1/conversations/cnv_25b90d8b-6d79-4725-af97-15f7ccc6dcaf
correlation: qa-1b7eebb6-a117-45ff-8a09-bd405b391811

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1b7eebb6-a117-45ff-8a09-bd405b391811
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1b7eebb6-a117-45ff-8a09-bd405b391811
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 284

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_25b90d8b-6d79-4725-af97-15f7ccc6dcaf","correlationId":"qa-1b7eebb6-a117-45ff-8a09-bd405b391811"}
```

## 74. GET /v1/conversations/{id}/messages

```text
#74 GET http://localhost:7070/v1/conversations/cnv_25b90d8b-6d79-4725-af97-15f7ccc6dcaf/messages
correlation: qa-ce0927f6-eac5-457c-a265-8a3033d81a78

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce0927f6-eac5-457c-a265-8a3033d81a78
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ce0927f6-eac5-457c-a265-8a3033d81a78
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 293

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_25b90d8b-6d79-4725-af97-15f7ccc6dcaf/messages","correlationId":"qa-ce0927f6-eac5-457c-a265-8a3033d81a78"}
```

## 75. POST /v1/conversations/{id}/messages

```text
#75 POST http://localhost:7070/v1/conversations/cnv_25b90d8b-6d79-4725-af97-15f7ccc6dcaf/messages
correlation: qa-9262059b-1a00-49ec-bf8b-aea3f56e7524

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9262059b-1a00-49ec-bf8b-aea3f56e7524
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 429 in 4 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9262059b-1a00-49ec-bf8b-aea3f56e7524
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 293

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_25b90d8b-6d79-4725-af97-15f7ccc6dcaf/messages","correlationId":"qa-9262059b-1a00-49ec-bf8b-aea3f56e7524"}
```

## 76. POST /v1/conversations/{id}/read

```text
#76 POST http://localhost:7070/v1/conversations/cnv_25b90d8b-6d79-4725-af97-15f7ccc6dcaf/read
correlation: qa-c77bb656-e1d8-4424-886e-8df6b1d4f168

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c77bb656-e1d8-4424-886e-8df6b1d4f168
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c77bb656-e1d8-4424-886e-8df6b1d4f168
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 289

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_25b90d8b-6d79-4725-af97-15f7ccc6dcaf/read","correlationId":"qa-c77bb656-e1d8-4424-886e-8df6b1d4f168"}
```

## 77. POST /v1/conversations/{id}/close

```text
#77 POST http://localhost:7070/v1/conversations/cnv_25b90d8b-6d79-4725-af97-15f7ccc6dcaf/close
correlation: qa-3e21d54b-9d8e-4f39-87b7-fa744e7231da

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3e21d54b-9d8e-4f39-87b7-fa744e7231da
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3e21d54b-9d8e-4f39-87b7-fa744e7231da
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 290

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/conversations/cnv_25b90d8b-6d79-4725-af97-15f7ccc6dcaf/close","correlationId":"qa-3e21d54b-9d8e-4f39-87b7-fa744e7231da"}
```

## 78. GET /v1/credits/balance

```text
#78 GET http://localhost:7070/v1/credits/balance
correlation: qa-11bbe87c-be62-44e9-aaa4-97b479e30c87

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-11bbe87c-be62-44e9-aaa4-97b479e30c87
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-11bbe87c-be62-44e9-aaa4-97b479e30c87
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 245

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/credits/balance","correlationId":"qa-11bbe87c-be62-44e9-aaa4-97b479e30c87"}
```

## 79. GET /v1/credits/ledger

```text
#79 GET http://localhost:7070/v1/credits/ledger
correlation: qa-69675fa7-6ed7-4efe-b287-a99cfd497db6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-69675fa7-6ed7-4efe-b287-a99cfd497db6
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-69675fa7-6ed7-4efe-b287-a99cfd497db6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 244

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/credits/ledger","correlationId":"qa-69675fa7-6ed7-4efe-b287-a99cfd497db6"}
```

## 80. POST /v1/credits/purchases

```text
#80 POST http://localhost:7070/v1/credits/purchases
correlation: qa-c9e54310-430d-43b4-a75b-18032fbdb59b

--- request headers ---
Accept: application/json
Idempotency-Key: qa-38384e8cd6354c2fbcd2fb2717a1bc0d
X-Correlation-Id: qa-c9e54310-430d-43b4-a75b-18032fbdb59b
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 429 in 3 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c9e54310-430d-43b4-a75b-18032fbdb59b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 247

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/credits/purchases","correlationId":"qa-c9e54310-430d-43b4-a75b-18032fbdb59b"}
```

## 81. GET /v1/admin/stats

```text
#81 GET http://localhost:7070/v1/admin/stats
correlation: qa-9066d4c9-66fa-4968-9612-e518db696b6d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9066d4c9-66fa-4968-9612-e518db696b6d
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 02 Nov 2026 09:38:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9066d4c9-66fa-4968-9612-e518db696b6d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/admin/stats","correlationId":"qa-9066d4c9-66fa-4968-9612-e518db696b6d"}
```

## 82. GET /v1/accounts/me

```text
#82 GET http://localhost:7070/v1/accounts/me
correlation: qa-b21121ce-7386-401a-a797-889c0e848cae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b21121ce-7386-401a-a797-889c0e848cae
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 02 Nov 2026 09:38:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b21121ce-7386-401a-a797-889c0e848cae
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 8
Retry-After: 8
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-b21121ce-7386-401a-a797-889c0e848cae"}
```

## 83. GET /v1/accounts/me

```text
#83 GET http://localhost:7070/v1/accounts/me
correlation: qa-4d652673-5468-4018-8b4b-60d574a1f746

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4d652673-5468-4018-8b4b-60d574a1f746
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 02 Nov 2026 09:38:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4d652673-5468-4018-8b4b-60d574a1f746
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 8
Retry-After: 8
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-4d652673-5468-4018-8b4b-60d574a1f746"}
```

## 84. GET /v1/accounts/me

```text
#84 GET http://localhost:7070/v1/accounts/me
correlation: qa-b4c36506-3076-4c4b-83ca-bb2019e3f946

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b4c36506-3076-4c4b-83ca-bb2019e3f946
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 02 Nov 2026 09:38:40 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b4c36506-3076-4c4b-83ca-bb2019e3f946
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 7
Retry-After: 7
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-b4c36506-3076-4c4b-83ca-bb2019e3f946"}
```

## 85. GET /v1/accounts/me

```text
#85 GET http://localhost:7070/v1/accounts/me
correlation: qa-cff18b7d-7852-4102-aed4-08a7c23ad830

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cff18b7d-7852-4102-aed4-08a7c23ad830
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 02 Nov 2026 09:38:40 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cff18b7d-7852-4102-aed4-08a7c23ad830
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 7
Retry-After: 7
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-cff18b7d-7852-4102-aed4-08a7c23ad830"}
```

## 86. GET /v1/accounts/me

```text
#86 GET http://localhost:7070/v1/accounts/me
correlation: qa-02eb685d-ba24-4950-8248-cc4c79d3f5b1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-02eb685d-ba24-4950-8248-cc4c79d3f5b1
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 02 Nov 2026 09:38:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-02eb685d-ba24-4950-8248-cc4c79d3f5b1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 6
Retry-After: 6
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-02eb685d-ba24-4950-8248-cc4c79d3f5b1"}
```

## 87. GET /v1/accounts/me

```text
#87 GET http://localhost:7070/v1/accounts/me
correlation: qa-68259b68-9909-489a-98a3-d996844b06a3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-68259b68-9909-489a-98a3-d996844b06a3
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 02 Nov 2026 09:38:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-68259b68-9909-489a-98a3-d996844b06a3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 6
Retry-After: 6
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-68259b68-9909-489a-98a3-d996844b06a3"}
```

## 88. GET /v1/accounts/me

```text
#88 GET http://localhost:7070/v1/accounts/me
correlation: qa-2dfcac78-3d99-4dff-8417-a4b89a85fdc0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2dfcac78-3d99-4dff-8417-a4b89a85fdc0
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 02 Nov 2026 09:38:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2dfcac78-3d99-4dff-8417-a4b89a85fdc0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 5
Retry-After: 5
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-2dfcac78-3d99-4dff-8417-a4b89a85fdc0"}
```

## 89. GET /v1/accounts/me

```text
#89 GET http://localhost:7070/v1/accounts/me
correlation: qa-69803c84-1fc8-4f41-a836-b49df4ba7f8a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-69803c84-1fc8-4f41-a836-b49df4ba7f8a
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 02 Nov 2026 09:38:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-69803c84-1fc8-4f41-a836-b49df4ba7f8a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 5
Retry-After: 5
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-69803c84-1fc8-4f41-a836-b49df4ba7f8a"}
```

## 90. GET /v1/accounts/me

```text
#90 GET http://localhost:7070/v1/accounts/me
correlation: qa-49b4c76a-13bd-4b72-970d-0cb741fbad9e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-49b4c76a-13bd-4b72-970d-0cb741fbad9e
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 02 Nov 2026 09:38:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-49b4c76a-13bd-4b72-970d-0cb741fbad9e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 4
Retry-After: 4
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-49b4c76a-13bd-4b72-970d-0cb741fbad9e"}
```

## 91. GET /v1/accounts/me

```text
#91 GET http://localhost:7070/v1/accounts/me
correlation: qa-845adaf9-a092-43f6-be81-d99b448e1b38

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-845adaf9-a092-43f6-be81-d99b448e1b38
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 02 Nov 2026 09:38:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-845adaf9-a092-43f6-be81-d99b448e1b38
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 4
Retry-After: 4
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-845adaf9-a092-43f6-be81-d99b448e1b38"}
```

## 92. GET /v1/accounts/me

```text
#92 GET http://localhost:7070/v1/accounts/me
correlation: qa-4166de5e-65d4-4161-bd90-a1f11930c97f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4166de5e-65d4-4161-bd90-a1f11930c97f
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 02 Nov 2026 09:38:44 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4166de5e-65d4-4161-bd90-a1f11930c97f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 3
Retry-After: 3
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-4166de5e-65d4-4161-bd90-a1f11930c97f"}
```

## 93. GET /v1/accounts/me

```text
#93 GET http://localhost:7070/v1/accounts/me
correlation: qa-522d97f2-5551-43c1-b373-599a0d820388

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-522d97f2-5551-43c1-b373-599a0d820388
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Mon, 02 Nov 2026 09:38:44 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-522d97f2-5551-43c1-b373-599a0d820388
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 3
Retry-After: 3
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-522d97f2-5551-43c1-b373-599a0d820388"}
```

## 94. GET /v1/accounts/me

```text
#94 GET http://localhost:7070/v1/accounts/me
correlation: qa-455485cb-c5c1-47d6-a4d3-c9a136f832e9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-455485cb-c5c1-47d6-a4d3-c9a136f832e9
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 02 Nov 2026 09:38:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-455485cb-c5c1-47d6-a4d3-c9a136f832e9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 2
Retry-After: 2
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-455485cb-c5c1-47d6-a4d3-c9a136f832e9"}
```

## 95. GET /v1/accounts/me

```text
#95 GET http://localhost:7070/v1/accounts/me
correlation: qa-c527881f-7511-42dd-b3b3-52f49ac147d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c527881f-7511-42dd-b3b3-52f49ac147d2
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 02 Nov 2026 09:38:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c527881f-7511-42dd-b3b3-52f49ac147d2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 1
Retry-After: 1
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-c527881f-7511-42dd-b3b3-52f49ac147d2"}
```

## 96. GET /v1/accounts/me

```text
#96 GET http://localhost:7070/v1/accounts/me
correlation: qa-6f12ad5a-9cce-4ca7-b60c-c97795bfd1dd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f12ad5a-9cce-4ca7-b60c-c97795bfd1dd
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Mon, 02 Nov 2026 09:38:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6f12ad5a-9cce-4ca7-b60c-c97795bfd1dd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 1
Retry-After: 1
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-6f12ad5a-9cce-4ca7-b60c-c97795bfd1dd"}
```

## 97. GET /v1/accounts/me

```text
#97 GET http://localhost:7070/v1/accounts/me
correlation: qa-2512b0e7-0fe2-4ccb-af24-a866cd2d63d5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2512b0e7-0fe2-4ccb-af24-a866cd2d63d5
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Mon, 02 Nov 2026 09:38:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-2512b0e7-0fe2-4ccb-af24-a866cd2d63d5
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
Content-Length: 181

{"id":"acc_a3237644-1730-446c-a459-17fb77acbe8c","handle":"qa-32ba73501279","displayName":"QA 32ba73501279","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.767726033Z"}
```

## 98. POST /v1/auth/token

```text
#98 POST http://localhost:7070/v1/auth/token
correlation: qa-4b2df32f-85e2-4de4-9c04-2795d73203b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4b2df32f-85e2-4de4-9c04-2795d73203b9
Content-Type: application/json

--- request body ---
{"handle":"qa-1abcb3100109","password":"****"}

--- response: 200 in 7 ms ---
Date: Mon, 02 Nov 2026 09:38:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-4b2df32f-85e2-4de4-9c04-2795d73203b9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 599
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3556ce5a-104c-41d2-93b4-ffc623fa8ab7"}
```

## 99. DELETE /v1/accounts/me

```text
#99 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-241a7858-cb48-488c-a09b-18dc3f9ce4c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-241a7858-cb48-488c-a09b-18dc3f9ce4c0
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Mon, 02 Nov 2026 09:38:46 GMT
Content-Type: text/plain
X-Correlation-Id: qa-241a7858-cb48-488c-a09b-18dc3f9ce4c0
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

## 100. POST /v1/auth/token

```text
#100 POST http://localhost:7070/v1/auth/token
correlation: qa-d9848246-b6ff-42a6-b129-02a6989fcc86

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d9848246-b6ff-42a6-b129-02a6989fcc86
Content-Type: application/json

--- request body ---
{"handle":"qa-1abcb3100109","password":"****"}

--- response: 401 in 5 ms ---
Date: Mon, 02 Nov 2026 09:38:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d9848246-b6ff-42a6-b129-02a6989fcc86
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d9848246-b6ff-42a6-b129-02a6989fcc86"}
```

## 101. DELETE /v1/accounts/me

```text
#101 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f9b6f8d4-17e5-4dc5-b0d0-0b847b6b0e61

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f9b6f8d4-17e5-4dc5-b0d0-0b847b6b0e61
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Mon, 02 Nov 2026 09:38:46 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f9b6f8d4-17e5-4dc5-b0d0-0b847b6b0e61
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

## 102. POST /v1/auth/token

```text
#102 POST http://localhost:7070/v1/auth/token
correlation: qa-530b85a9-64ee-4de5-a849-718ec5b64d44

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-530b85a9-64ee-4de5-a849-718ec5b64d44
Content-Type: application/json

--- request body ---
{"handle":"qa-32ba73501279","password":"****"}

--- response: 401 in 6 ms ---
Date: Mon, 02 Nov 2026 09:38:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-530b85a9-64ee-4de5-a849-718ec5b64d44
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-530b85a9-64ee-4de5-a849-718ec5b64d44"}
```
